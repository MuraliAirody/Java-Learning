package JavaStreamAPI;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
        int[] a = new int[]{4, 2, 7, 1};

        int[] b = new int[]{8, 3, 9, 5};

        IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().forEach(ele -> System.out.print(ele + " "));
        System.out.println();

        //TODO:
        String s1 = "RaceCar";
        String s2 = "CarRace";

        s1 = Arrays.stream(s1.split("")).sorted(Comparator.naturalOrder()).collect(Collectors.joining());
        s2 = Arrays.stream(s2.split("")).sorted(Comparator.naturalOrder()).collect(Collectors.joining());

        if (s1.equals(s2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not an anagram");
        }

        //TODO:

        int i = 15623;
        int res = Arrays.stream(String.valueOf(i).split("")).mapToInt(Integer::parseInt).reduce((a1, b1) -> a1 + b1).getAsInt();
        System.out.println(res);

        //TODO: Palindrome
        String str = "ROTATOR";
        boolean ans = IntStream.rangeClosed(0, str.length() / 2).allMatch(ind -> str.charAt(ind) == str.charAt(str.length() - ind - 1));
        if (ans) {
            System.out.println(str + " :is palindrome");
        } else {
            System.out.println(str + " :is not palindrome");
        }

        List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");

        listOfStrings.stream().filter(st -> Character.isDigit(st.charAt(0))).forEach(st -> System.out.print(st + " "));

        System.out.println();

        List<Integer> listOfInteger = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
        HashSet<Integer> set = new HashSet<>();

        Set<Integer> duplicateIntegerResult = listOfInteger.stream().filter(ele -> !set.add(ele)).collect(Collectors.toSet());

        System.out.println(duplicateIntegerResult.toString());

        //TODO: Print Duplicate Elements
        inputString = inputString.replaceAll("\\s+", "").toLowerCase();

        HashSet<String> charSet = new HashSet<>();
        Set<String> duplicateSetResult = Arrays.stream(inputString.split("")).filter(c -> !charSet.add(c)).collect(Collectors.toSet());
        System.out.println(duplicateSetResult.toString());

        //TODO:
        LinkedHashMap<Character, Long> firstDuplicateElement = inputString.chars().mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
        java.util.Map.Entry<Character,Long> entryRes = firstDuplicateElement.entrySet().stream()
                .filter(ent -> ent.getValue()>1).findFirst().orElse(null);
        System.out.println(entryRes != null ?entryRes.getKey()+" : "+entryRes.getValue():"No Result");

    }
}
