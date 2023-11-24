import java.util.ArrayList;

public class Concatinating {
    public static void main(String[] args) {
        System.out.println('a'+'b'); //char are converted to ASCII value, when there is a +

        System.out.println("a"+"b");

        System.out.println("a"+12);
        System.out.println(new ArrayList<>());

        System.out.println("a"+new ArrayList<>());
//        System.out.println(new Integer(50)+new ArrayList<>()); //one string value must be there for successful concatenation
        System.out.println(new Integer(50)+""+new ArrayList<>());
    }
}
