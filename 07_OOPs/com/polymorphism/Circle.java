package com.polymorphism;

public class Circle extends Shapes{
    @Override
    void area() {
        super.area();
        System.out.println("Area of circle pi*r*r");
    }
}
