package com.oops._01;

public class GarbageCollector {
    public static void main(String[] args) {
        DestroyObject destroyObject;

        for (int i = 0; i <10000000 ; i++) {
            destroyObject = new DestroyObject("Rajuuu");
        }


    }
}

class DestroyObject{
    String name;
    DestroyObject(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("object destroyed");
    }
}
