

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

//maintain the element in Ascending order

public class TreeSetEx {
    public static void main(String[] args) {
        Set<String> country = new TreeSet<>();

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
