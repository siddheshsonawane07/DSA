package Hashing;

import java.util.Hashtable;
import java.util.LinkedHashMap;

public class HashTableUsingFramework {
    //synchronized implementation of hashing

    static void HashTableSync() {
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
        ht.put(1, "Sid");
        ht.put(2, "Rush");
        ht.put(3, "Tan");

        System.out.println(ht);
    }

//    static void HashMapAsync(int[] arr) {
//        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
//        for (int j : arr) {
//            Integer c = hm.get(j);
//            //if this is the first occurrence of the element
//            if (hm.get(j) == null) {
//                hm.put(j, 1);
//            } else {
//                hm.put(j, ++c);
//            }
//        }
//        System.out.println(hm);
//    }

    static void BasicLinkedHashMap() {
        LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
        lhm.put("one", "first");
        lhm.put("two", "second");
        lhm.put("three", "third");

        System.out.println(lhm);
    }

    public static void main(String[] args) {

        HashTableSync();
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
//        HashMapAsync(arr);
        BasicLinkedHashMap();
    }
}
