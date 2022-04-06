package Collections_Framework;


import java.util.Set;
import java.util.TreeSet;

public class TreeSetss {

    public static void main(String[] args) {
        //same as hashsets
        //additional properties of binary search tree
        //also the time complexities changes from O(1) to O(logn) due to bst

        Set<Integer> set = new TreeSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        set.remove(3);
        System.out.println(set.contains(3));
    }
}
