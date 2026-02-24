package JavaStreamAPI;

import java.util.*;
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
                emp -> ((Employee) emp).getSalary()).reversed()).findFirst().get(); //can use max as well

        System.out.println(highestSalariedEmp);


        //TODO:Get the names of all employees who have joined after 2015?
        employeeList.stream().filter(emp -> emp.getYearOfJoining() > 2015).forEach(emp -> System.out.println(emp.getName()));
        System.out.println();

        //TODO: Count the number of employees in each department?
        Map<String, Long> noOfEmpPerDep = employeeList.stream().collect(Collectors.groupingBy(emp -> emp.getDepartment(), Collectors.counting()));
        System.out.println(noOfEmpPerDep.entrySet());

        //TODO: What is the average salary of each department?
        Map<String, Double> avgSalaryOfDep = employeeList.stream().collect(Collectors.groupingBy(emp -> emp.getDepartment(), Collectors.averagingDouble(emp -> emp.getSalary())));
        System.out.println(avgSalaryOfDep.entrySet());

        //TODO: Get the details of youngest male employee in the product development department?
        Optional<Employee> smallAge = employeeList.stream().filter(
                        emp -> (emp.getGender().equals("Male") && emp.getDepartment().equals("Product Development")))
                .min(Comparator.comparingInt(Employee::getAge));
        System.out.println(smallAge.isPresent()?smallAge.get():"No employees found");

//        Employee youngestMaleEmployeeInProductDevelopmentWrapper=
//                employeeList.stream()
//                        .filter(e -> Objects.equals(e.getGender(), "Male") && Objects.equals(e.getDepartment(), "Product Development"))
//                        .min(Comparator.comparingInt(Employee::getAge)).get();
//
//        Employee youngestMaleEmployeeInProductDevelopment = youngestMaleEmployeeInProductDevelopmentWrapper;
//        System.out.println(youngestMaleEmployeeInProductDevelopment);

        //TODO: Who has the most working experience in the organization?

       java.util.Optional<Employee> experiencedEmplyee = employeeList.stream().min(Comparator.comparingInt(Employee::getYearOfJoining));
       System.out.println(experiencedEmplyee.isPresent()?experiencedEmplyee.get():"No employees found");

        //TODO: How many male and female employees are there in the sales and marketing team?
        Map<String, Long> departWiseDender = employeeList.stream().filter(emp ->
                        emp.getDepartment().equals("Sales And Marketing"))
                .collect(Collectors.groupingBy(emp -> emp.getGender(), Collectors.counting()));
        System.out.println(departWiseDender.entrySet());

        //TODO: What is the average salary of male and female employees?
       Map<String,Double> avgSalary = employeeList.stream().collect(Collectors.groupingBy(emp -> emp.getGender(),
                Collectors.averagingDouble(emp -> emp.getSalary())));
        System.out.println(avgSalary.entrySet());

        //TODO:  List down the names of all employees in each department?
        Map<String, List<Employee>> depWiseEmployee = employeeList.stream().collect(Collectors.groupingBy(emp -> emp.getDepartment()));

        for(Map.Entry<String, List<Employee>> emps: depWiseEmployee.entrySet()){
            System.out.println("====================");
            System.out.println(emps.getKey());
            System.out.println("....................");
            emps.getValue().stream().forEach(emp -> System.out.println(emp.getName()));
        }

        //TODO: What is the average salary and total salary of the whole organization?
        int totalSalary = employeeList.stream().mapToInt(emp -> (int) emp.getSalary()).sum();
        System.out.println(totalSalary);
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
