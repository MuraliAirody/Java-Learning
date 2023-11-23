import java.util.Arrays;

public class Basic {
    public static void main(String[] args) {
        String a = "hello";

        String b = a; //a reference is passed to the b

        a = "new hello"; // assign a with a different value

        System.out.println(a+" "+b); // but still the b value doesn't  change
        //this is bcz, after assign,'a' with different value another new object is created here in a pool

        String a1 = "hello";

        if(a1 == b){ //these 2 pointing same reference value in pool, pool created in heap to utilize the memory
            System.out.println("yes b and a1 are pointing to the same obj"); //ans
        }
        else{
            System.out.println("yes b and a1 are pointing to the diff obj");

        }
        if(a == a1){
            System.out.println("yes a and a1 are pointing to the same obj");
        }else{
            System.out.println("yes a and a1 are pointing to the diff obj"); //ans

        }

        String str1 = new String("new");
        String str2 = new String("new");

        System.out.println(str1 == str2); //false (comparing the reference)
        System.out.println(str1.equals(str2)); //true (comparing the value

        System.out.println(str1.charAt(1)); //getting the char at

        int[] arr = {1,2,3,4,5};
        System.out.println(arr); //random hashcode value will be return here
        //internally its calling toString method of object which is returning the hashcode value

        //so we can also override the toString method
        System.out.println(Arrays.toString(arr));
    }

}
