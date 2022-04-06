package Collections_Framework;

import java.util.HashSet;
import java.util.Set;

public class HashSets {

    public static void main(String[] args) {
        //duplicate elements are not allowed
        //unordered sets

        //internal hashing function
        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        set.remove(3);
        System.out.println(set.contains(3));
    }
}
