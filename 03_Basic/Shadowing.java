public class Shadowing {
    static int x = 90; // this will be shadowed at line 8
    int num = 99;
    public static void main(String[] args) {
        System.out.println(x); // 90
        int x; // the class variable at line 4 is shadowed by this
//        System.out.println(x); // scope will begin when value is initialised
        x = 40;
        System.out.println(x); // 40
        fun();
        new Shadowing().fun2();
        //if the global variable the local variable with the same name, method give a high preference to the local variable
        //if we want to access the global variable inside the method scope, in the above situation,if the global variable is static

        System.out.println("global inside method "+Shadowing.x);

        //suppose if the global variable is non-static we have to create an object for the class
        System.out.println(new Shadowing().num);
//        System.out.println(this.num); // this cannot be referenced from static context
    }

    static void fun() {
        System.out.println(x);
    }

    void fun2(){
        System.out.println("non static function start");
        System.out.println(x);
        System.out.println(new Shadowing().num);
        System.out.println(this.num);
        System.out.println("non static function end");

    }
}