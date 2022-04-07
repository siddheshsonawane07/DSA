package Collections_Framework;

import java.util.HashMap;
import java.util.Map;

public class HashMapss {

    public static void main(String[] args) {

        //stores data in key value pair
        Map<Integer, String> num = new HashMap<Integer, String>();

        num.put(1, "naruto");
        num.put(2, "deathnote");

        num.putIfAbsent(1, "Naruto Shippuden");
        System.out.println(num);
    }
}
