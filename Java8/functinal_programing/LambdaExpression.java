package Java8.functinal_programing;

import java.util.ArrayList;

public class LambdaExpression {

    public static void main(String[] args) {
        
        FunctionalInterface obj = (int x)->System.out.println(x*20);

        obj.abstractMethod(5);


        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.forEach(item -> System.out.println(item));
    }
    
}


/**
 *  FunctionalInterface
 */
interface  FunctionalInterface {

    void abstractMethod(int x);

    default void defaultMethod(){
        System.out.println("Default method of functional interface");
    }
}
