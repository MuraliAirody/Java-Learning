import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NewQues {
    public static void main(String[] args) {
        // How do you remove duplicate elements from a list using Java 8 streams?
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");

        List<String> unique = listOfStrings.stream().distinct().collect(Collectors.toList());

        for (String s : unique)
            System.out.println(s);
        // ---------------------------------------------------------------------------------------------------------------------------------
        // How do you find frequency of each character in a string using Java 8 streams?
        String inputString = "Java Concept Of The Day";
        Map<Character, Long> frequency = inputString.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> (char) c, Collectors.counting()));
        System.out.println(frequency);
        // ---------------------------------------------------------------------------------------------------------------------------------

        // How do you find frequency of each element in an array or a list?
        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler",
                "Note Book", "Pencil");

        Map<String, Long> freq = stationeryList.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        System.out.println(freq);
        // ---------------------------------------------------------------------------------------------------------------------------------

        // How do you sort the given list of decimals in reverse order?
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);

        List<Double> deciList = decimalList.stream().map(deci -> -deci).sorted().map(deci -> -deci)
                .collect(Collectors.toList());
        System.out.println(deciList);

        deciList.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s));
        // ---------------------------------------------------------------------------------------------------------------------------------

        // Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix
        // and ‘,’ as delimiter?
        List<String> listOfStrings1 = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");

        String s = listOfStrings1.stream().collect(Collectors.joining(",", "[", "]"));
        System.out.println(s);
        // ---------------------------------------------------------------------------------------------------------------------------------

        // Given a list of integers, find maximum and minimum of those numbers?
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        // int max = listOfIntegers.stream().max((int1, int2) -> int1 > int2 ? 1 :
        // -1).get();
        int max = listOfIntegers.stream().max(Comparator.naturalOrder()).get();
        // int min = listOfIntegers.stream().min((int1, int2) -> int1 > int2 ? 1 :
        // -1).get();
        int min = listOfIntegers.stream().min(Comparator.naturalOrder()).get();

        System.out.println("max: " + max + " " + "min: " + min);
        // ---------------------------------------------------------------------------------------------------------------------------------

        // How do you merge two unsorted arrays into single sorted array using Java 8
        // streams?
        int[] a = new int[] { 4, 2, 7, 1 };

        int[] b = new int[] { 8, 3, 9, 5 };

        int[] union = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
        System.out.println(Arrays.toString(union));

        String[] names1 = { "Balazs", "Vikrant", "Mohasin", "Ahmed" };
        String[] names2 = { "Vihar", "Balazs", "Roshan", "Vikrant" };

        String[] names = Stream.concat(Arrays.stream(names1), Arrays.stream(names2)).sorted()
                .toArray(size -> new String[size]);
        System.out.println(Arrays.toString(names));
        // ---------------------------------------------------------------------------------------------------------------------------------

        // How do you merge two unsorted arrays into single sorted array without
        // duplicates?
        int[] a1 = new int[] { 4, 2, 5, 1 };

        int[] b1 = new int[] { 8, 1, 9, 5 };
        int[] unionDis = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();
        System.out.println(Arrays.toString(unionDis));

        // ---------------------------------------------------------------------------------------------------------------------------------
        // How do you get three maximum numbers and three minimum numbers from the given
        // list of integers?
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);


    }
}
