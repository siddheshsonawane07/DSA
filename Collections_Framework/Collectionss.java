package Collections_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collectionss {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println("minimum element " + Collections.min(list));
        System.out.println("maximum element " + Collections.max(list));

        //collections different method


    }
}
