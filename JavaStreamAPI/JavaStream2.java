package JavaStreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JavaStream2 {
    public static void main(String[] args) {
        List<Employee> employeeList = addEmployees();

        //TODO: How many male and female employees are there in the organization?

        Map<String, Long> genderDiff = employeeList.stream().collect(
                Collectors.groupingBy(emp -> emp.getGender(), Collectors.counting()));
        System.out.println(genderDiff.entrySet());

        //TODO: Print the name of all departments in the organization?

        List<String> depList = employeeList.stream().map(emp -> emp.getDepartment()).distinct().toList();
        System.out.println(depList);

        //TODO: What is the average age of male and female employees?
        Map<String, Double> avgAge = employeeList.stream().collect(Collectors.groupingBy(
                emp -> emp.getGender(), Collectors.averagingInt(emp -> emp.getAge())));
        System.out.println(avgAge.entrySet());

        //TODO:Get the details of highest paid employee in the organization?
        Employee highestSalariedEmp = employeeList.stream().sorted(Comparator.comparingDouble(
                emp -> ((Employee)emp).getSalary()).reversed()).findFirst().get(); //can use max as well

        System.out.println(highestSalariedEmp);
    }

    private static List<Employee> addEmployees() {
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        return employeeList;
    }
}
