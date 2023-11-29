package com.staticExample;

public class Main {
    public static void main(String[] args) {
      Human raj = new Human(20,20000,"raj",false);

      Human naveen = new Human(22,25000,"Naveen",true);

        System.out.println(raj.name);
        System.out.println(naveen.name);




//        System.out.println(raj.peopleCount); //1
//        System.out.println(naveen.peopleCount); //1
        // there are already 2 people naveen and raj still its counting 1 only

        // so the peopleCount property should belong to class instead of every single object
        System.out.println(Human.peopleCount);
        System.out.println(Human.peopleCount);

//        greeting() //Non-static method 'greeting()' cannot be referenced from a static context

          new Main().greeting(); // need to create object to access non-static methods inside static

    }

    void fun(){
        greeting(); // can access non-static inside non-static, bcz any how fun() will call
                    // in main method using object reference only, so no need of object creation again here
    }

    void greeting(){
        System.out.println("hello");
    }
}
