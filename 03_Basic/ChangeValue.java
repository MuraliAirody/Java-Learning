import java.util.Arrays;

public class ChangeValue{
    public static void main(String[] args) {
        // create an array
        int[] arr = {1, 3, 2, 45, 6};
        int b = 55;
        String str = new String("hello");
        change(arr,b,str);
        System.out.println(Arrays.toString(arr)+" "+b+" "+str);


    }

    static void change(int[] nums,int b,String str) { //here we are passing the reference of the 'arr' and passing value of the 'b'
        nums[0] = 99; // if you make a change to the object via this ref variable, same object will be changed
        b = 500;
        str = "Hi";
    }
}
