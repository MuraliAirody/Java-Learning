import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        /*
         * byte: Stores whole numbers from -128 to 127, 1byte 8 bits 
         * short: Stores whole numbers from -32,768 to 32,767, 2 byte 16 bits
         * int: Stores whole numbers from -2,147,483,648 to 2,147,483,647, 4 byte 32 bits
         * char: Stores a single character/letter or ASCII values, 2 byte 16 bits
         * float: Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits, 4byte 32bits  (3.5f)
         * double: Stores fractional numbers. Sufficient for storing 15 decimal digits, 8 byte 64 bits   (3.5)
         * long: Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807, 8 byte 64 bits (55545l)
         * boolean: Stores true or false values, 1bit 
         */
       // Scanner sc = new Scanner(System.in);

        //float num1 = sc.nextFloat();    //if we enter integer also, it will convert automatically float     
        //float num2 = sc.nextFloat();
        
        //System.out.println("enter integer value"); 
        //int a = sc.nextInt(); //it will take only integer value not floating point value if we enter the other number which is having greater size than integer it will throw 'Exception in thread "main" java.util.InputMismatchException'

        //System.out.println(num1+num2);

        int a1 = 256;
        byte a1byte = (byte)a1; //int compressed it into byte

        System.out.println(a1byte);
    }
}
