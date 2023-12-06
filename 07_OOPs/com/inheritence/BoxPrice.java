package com.inheritence;

public class BoxPrice extends BoxWeight{

    int price;
    BoxPrice(){
        super();
        this.price = -1;
    }

    BoxPrice(BoxPrice other){
        super(other);
        this.price = other.price;
    }

    public BoxPrice(double l, double h, double w, int weight, int price) {
        super(l, h, w, weight);
        this.price = price;
    }

    public BoxPrice(double side, double weight, int price) {
        super(side, weight);
        this.price = price;
    }
}
