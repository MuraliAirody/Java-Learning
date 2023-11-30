package com.staticExample;

public class StaticInitialization {
    static  int a =10;
    static int b;

    static {   //static block only run once before the main method
        System.out.println("inside static block");
        b=a*10;
    }
    public static void main(String[] args) {

        StaticInitialization obj = new StaticInitialization();
        System.out.println(StaticInitialization.a + " " + StaticInitialization.b);

        StaticInitialization.b += 10;

        System.out.println(StaticInitialization.a + " " + StaticInitialization.b);

        StaticInitialization obj2 = new StaticInitialization();
        System.out.println(StaticInitialization.a + " " + StaticInitialization.b);
    }
}
