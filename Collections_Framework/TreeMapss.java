package Collections_Framework;


import java.util.Map;
import java.util.TreeMap;

public class TreeMapss {

    public static void main(String[] args) {

        //put keys in bst
        //sorting is done in
        Map<String, Integer> numbers = new TreeMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);

        System.out.println(numbers);
        System.out.println(numbers.containsValue(3));

    }
}
