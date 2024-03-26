package collections;

import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        
        Vector<Integer> vect = new Vector<>();

        System.out.println(vect.size());

        vect.add(12);
        vect.add(20);
        vect.add(2);
        vect.add(122);
     
       
        System.out.println(vect.size());

        System.out.println(vect);
    }
}
