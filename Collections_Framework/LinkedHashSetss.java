package Collections_Framework;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetss {
    public static void main(String[] args) {
        //same as hashsets
        //additional properties of linked list
        //maintains an order in which the elements are added

        Set<Integer> set = new LinkedHashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        set.remove(3);
        System.out.println(set.contains(3));
    }
}
