package JavaStreamAPI;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NewQues2 {
    public static void main(String[] args) {
        // ---------------------------------------------------------------------------------------------------------------------------------

        // Java 8 program to check if two strings are anagrams or not?
        String s1 = "RaceCar";
        String s2 = "CarRace";

        String s1Sort = Arrays.asList(s1.toUpperCase().split(""))
                .stream().sorted().collect(Collectors.joining(""));

        String s2Sort = Arrays.asList(s2.toUpperCase().split(""))
                .stream().sorted().collect(Collectors.joining(""));
        System.out.println(s1Sort + " " + s2Sort);
        if (s1Sort.equals(s2Sort))
            System.out.println("ANAGRAM");
        else
            System.out.println("Not an ANAGRAM");

        // ---------------------------------------------------------------------------------------------------------------------------------

        // Find sum of all digits of a number in Java 8?

        int i = 15623;
        int sum = Arrays.asList(String.valueOf(i).split("")).stream()
                .collect(Collectors.summingInt(num -> Integer.parseInt(num)));

        System.out.println(sum);
    }
}
