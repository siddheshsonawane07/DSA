package Hashing;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTable {
    //synchronized implementation of hashing

    static void HashTableSync() {
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
        ht.put(1, "Sid");
        ht.put(2, "Rush");
        ht.put(3, "Tan");

        System.out.println(ht);
    }

    static void HashMapAsync() {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

    }

    public static void main(String[] args) {

        HashTableSync();
    }
}
