import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(5,4,5,8,6);

        multiple1(50,50,"rajesh","mahesh","sujnesh");
//        multiple(50,"rajesh","mahesh","sujnesh"); //parameter should be matched with the multiple function arguments

//        multiple(50,"rajesh","mahesh","sujnesh",50); // variable length argument must come at the end of the parameter list

    }

//    static  void multiple(int a,String ...names,int b){
//        System.out.println(a+" "+b+" "+Arrays.toString(names));
//    }
    static  void multiple1(int a,int b,String ...names){
        System.out.println(a+" "+b+" "+Arrays.toString(names));
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
