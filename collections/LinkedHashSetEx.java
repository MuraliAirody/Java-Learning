
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

//linked hashSet maintain the insertion order, but the hashSet does not maintain any insertion order

public class LinkedHashSetEx {
    public static void main(String[] args) {
        Set<String> country = new LinkedHashSet<>();

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
