public class MethodOverloading {

    static void myFunc(long a,int b){
        System.out.println("received long and int "+a+" "+b);
    }

    static void myFunc(long a,long b){
        System.out.println("received long "+a+" "+b);
    }

    static void myFunc(int a,long b){
        System.out.println("received int and long "+a+" "+b);
    }

    static void myFunc(int a,int b){
        System.out.println("received int "+a+" "+b);
    }
    public static void main(String[] args) {
        myFunc(1,5);
    }
}
