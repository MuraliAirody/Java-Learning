package com.inheritence;

public class Main {
    public static void main(String[] args) {

//        Box box1 = new Box(4.6, 7.9, 9.9);
//        System.out.println(box1.getL()); //4.6
//        Box box2 = new Box(box1);

//        System.out.println(box1.l+" "+box1.h+" "+ box1.w);
//        System.out.println(box2.l+" "+box2.h+" "+ box2.w);

        BoxWeight boxWeight= new BoxWeight();
        System.out.println(boxWeight.h+" "+boxWeight.weight);

        BoxWeight boxWeight1 = new BoxWeight(4,5,5);

        System.out.println(boxWeight1.h+" "+boxWeight1.w+" "+boxWeight1.weight);//5.0, 5.0, 0


        Box box =  new BoxWeight(4,5,6,7); // super class reference variable can point the sub class object
//        System.out.println(box.weight);

//        BoxWeight boxWeight2 = new Box(); // can't point child class reference to super class object

        //what need to be access depends on type of reference variable not the type of object

        BoxWeight boxWeight5 = new BoxWeight(5,7,9,6);

    }
}
