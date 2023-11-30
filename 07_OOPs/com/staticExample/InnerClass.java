package com.staticExample;

public class InnerClass {     //outer class cannot be a static, it won't be belong to any class that's why

    class Test{  //depend on object, hence need to create a InnerClass Object to access the Test clas
        int marks;
        int roll_number;

        Test(){
            marks = 15;
            roll_number = 122;
        }
    }

    static class NewMain{ //Not depend on object, just depend on class

        int marks;
        int roll_number;

        NewMain(){
            marks = 15;
            roll_number = 122;
        }
    }

    public static void main(String[] args) {
//        Test t1 = new Test(); // class Test is InnerClass property, not able to access without the InnerClass
        InnerClass in  = new InnerClass();
        Test t2 = in.new Test();
        System.out.println(t2.roll_number);

        NewMain newMain = new NewMain();
        System.out.println(newMain.marks);
    }
}
