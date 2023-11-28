package com.oops;

public class WrapperExample {
    public static void main(String[] args) {
        int a=5; //primitive
        int b =10;

        Integer num1 =45; //object
        Integer num2 = 50;


        swap1(a,b);

        System.out.println(a+" "+b); // Java support only pass by value

        swap2(num1,num2);

        System.out.println(num1+" "+num2); //Still the value is not swapped bcz the Integer is final

        final int roll_no = 12456;
//        roll_no = 15; // Cannot assign a value to final variable 'roll_no'

    }

    public static void swap1(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }

    public  static  void swap2(Integer a,Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}
