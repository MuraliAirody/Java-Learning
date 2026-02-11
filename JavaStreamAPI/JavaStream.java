package JavaStreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStream {

    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

        //TODO: Portioning using stream
        Map<Boolean, List<Integer>> partition = listOfIntegers.stream()
                .collect(Collectors.partitioningBy(ele -> ele % 2 == 0));

        for (Map.Entry<Boolean, List<Integer>> entry : partition.entrySet()) {
            if (entry.getKey()) {
                System.out.println("Even numbers");
                System.out.println(Arrays.toString(entry.getValue().toArray()));
            } else {
                System.out.println("Odd numbers");
                System.out.println(Arrays.toString(entry.getValue().toArray()));
            }
        }

        //TODO:

        String inputString = "Java Concept Of The Day";

        Map<Character, Long> groupBy = inputString.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(groupBy.toString());

        //TODO:
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        decimalList.stream().sorted(Comparator.reverseOrder()).forEach(ele -> System.out.print(ele + " "));
        System.out.println();

        //TODO:
        int[] a = new int[] {4, 2, 7, 1};

        int[] b = new int[] {8, 3, 9, 5};

        IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().forEach(ele-> System.out.print(ele+" "));
        System.out.println();

        //TODO:
        String s1 = "RaceCar";
        String s2 = "CarRace";

        s1 = Arrays.stream(s1.split("")).sorted(Comparator.naturalOrder()).collect(Collectors.joining());
        s2 = Arrays.stream(s2.split("")).sorted(Comparator.naturalOrder()).collect(Collectors.joining());

        if(s1.equals(s2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not an anagram");
        }

        //TODO:

        int i = 15623;
       int res = Arrays.stream(String.valueOf(i).split("")).mapToInt(Integer::parseInt).reduce((a1, b1)->a1+b1).getAsInt();
        System.out.println(res);

        //TODO: Palindrome
        String str = "ROTATOR";
        IntStream.rangeClosed()
    }
}
