import java.util.Scanner;

public class TemperatureConvertor {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.print("enter the tem in C: ");
        float tempC = sc.nextFloat();

        float f = (tempC*9/5)+32;

        System.out.println("Temp "+f);
    }
}
