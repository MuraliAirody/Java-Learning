import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String s = "Hello how are you ?";

        System.out.println(s.toCharArray());
        System.out.println(Arrays.toString(s.toCharArray()));

        System.out.println(s.toUpperCase());

        System.out.println(s.strip());
    }
}
