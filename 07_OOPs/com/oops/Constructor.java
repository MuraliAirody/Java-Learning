package com.oops;

public class Constructor {
    public static void main(String[] args) {
       Employee emp = new Employee();

       Employee emp1 = new Employee(123,"Rahul");
        System.out.println(emp1.name+" "+emp1.rollNumber);

        emp1.greeting();
        Employee emp2 = new Employee(193,"Raj");
        emp2.greeting();



        Employee random = new Employee(emp1); // passing an object
        System.out.println(random.name+" "+random.rollNumber);

        Employee random2 = new Employee();

        System.out.println("Random2 "+random2.name);
    }
}

class Employee{

    int rollNumber;
    String name;

    //Every class by default have one constructor, that run when we create an object.And occupy some memory
    /*
    * Employee(){
    *
    * }
    * */

    //once we declare constructor manually there will not default constructor
    Employee(){   //No argument constructor
        this(100,"raaaaj");
        System.out.println("No argument constructor");
    }

    Employee(int rollNumber,String name){
       this.rollNumber=rollNumber;
       this.name=name;
    }

    Employee(Employee obj){
        this.name = obj.name;
        this.rollNumber = obj.rollNumber;;
    }

    public void greeting(){
        System.out.println("Hello "+this.name);
    }
}
