package com.staticExample;

public class Human {
    int age;
    int salary;
    String name;
    boolean married;

    static int peopleCount;
    Human(int age,int salary,String name,boolean married){
        this.age=age;
        this.salary=salary;
        this.name=name;
        this.married=married;
//        this.peopleCount+=1;
        Human.peopleCount+=1;
    }
}
