package JavaStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JavaStream {

    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

        //TODO: Portioning using stream
        Map<Boolean, List<Integer>> partition = listOfIntegers.stream()
                .collect(Collectors.partitioningBy(ele -> ele%2==0));

        for(Map.Entry<Boolean,List<Integer>> entry:partition.entrySet()){
            if(entry.getKey()){
                System.out.println("Even numbers");
                System.out.println(Arrays.toString(entry.getValue().toArray()));
            }else{
                System.out.println("Odd numbers");
                System.out.println(Arrays.toString(entry.getValue().toArray()));
            }
        }

        //TODO:

    }
}
