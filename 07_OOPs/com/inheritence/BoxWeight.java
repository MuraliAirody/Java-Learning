package com.inheritence;

public class BoxWeight extends Box {

    int weight;
    BoxWeight(){
        this.weight=-1;
    }

    public BoxWeight(int i, int i1, int i2) {
        super(i,i1,i2);
    }

    public BoxWeight(double l, double h, double w, int weight) {
        super(l, h, w);
        this.weight = weight;

        //weight is the variable
        System.out.println("inside constructor "+weight);     //weight in the current scope
        System.out.println("inside boxWeight "+this.weight); //global scope (BoxWeight)
        System.out.println("from super "+super.weight);//global scope in super class (Box)

    }

    public BoxWeight(BoxPrice other) {
    }

    public BoxWeight(double side, double weight) {

    }
}
