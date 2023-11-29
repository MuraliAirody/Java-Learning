package com.oops._01;

public class Basic {
    public static void main(String[] args) {
       Student s1 = null;
//        System.out.println(s1.marks); // null pointer exception

        Student s2 = new Student();
        System.out.println(s2);
        System.out.println(s2.marks);

        Student s3 = new Student();
        s3.marks = 50.0f;
        s3.name = "Raj";
        s3.roll_no = 123;

        System.out.println(s3.marks+" "+s3.name);
    }
}

class Student{
    int roll_no;
    String name="unknown";
    float marks;
}
