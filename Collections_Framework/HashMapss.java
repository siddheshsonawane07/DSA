package Collections_Framework;

import java.util.HashMap;
import java.util.Map;

public class HashMapss {

    public static void main(String[] args) {

        //stores data in key value pair
        //hashmap is an array of buckets where in each bucket contains elements

        Map<Integer, String> num = new HashMap<Integer, String>();

        //put operation
        //hash function is applied
        //loop in the bucket to check whether the key is present or not
        //if it is present, then update it
        //if it is not present, then add it in the last
        //n: total number of elements
        //N: number of buckets
        // time complexity of the operation: O(lambda) where lambda = (n/N)
        //lambda: average elements per bucket
        //lambda<=k
        //k: threshold value
        //lambda value increases if we insert number of elements in the hashmap
        //if the lambda crosses the value of k, then rehashing occurs and the value of lambda is kept under control

        num.put(1, "Delhi");
        num.put(1, "Pune");
        num.put(1, "Bombay");
        num.put(2, "Chennai");
        num.put(3, "Pune");

        num.get(1);
        num.remove(1);
        num.clear();
        num.size();

        for (int i : num.keySet()) {
            System.out.println(i);
        }

        for (String i : num.values()) {
            System.out.println(i);
        }


    }
}
