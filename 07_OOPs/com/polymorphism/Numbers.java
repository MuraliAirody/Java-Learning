package com.polymorphism;

public class Numbers {
    public void sum(){
        System.out.println("Nothing");
    }

    public  int sum (int a,int b){
        return  a+b;
    }

//    public String sum(int a,int b){ // arguments are same
//        return  "a+b";
//    }

    public String sum(int a,int b,String name){
        return  name;
    }

    public void sum(double a,double b,double c,double d){

    }

    public static void main(String[] args) {
        Numbers num = new Numbers();

        num.sum(1,2,3,5); //call the double automatic conversion if there is no 4 integer argument
    }

}
