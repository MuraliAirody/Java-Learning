package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class HashSetEx {
    public static void main(String[] args) {
        Set<String> country = new HashSet<>();

        country.add("India");
        country.add("England");
        country.add("Australia");

        country.add("India"); // duplicates not allowed, it will replace the previously existing element

        System.out.println(country);

        Iterator<String>  itr = country.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
