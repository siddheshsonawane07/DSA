package Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Arrays3List {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(5);
//        list.add(541);
//        list.add(542);
//        list.add(543);
//        list.add(545);
//        list.add(549);
//        list.add(542);
//        list.add(541);
//        list.add(547);
//        list.add(546);
//        list.add(543);
//
//        System.out.println(list);
//        System.out.println(list.contains(541));;
//        list.set(1,0);
//        System.out.println(list);
//        list.remove(4);
//        System.out.println(list );

        for (int i = 0; i < 6; i++) {
            list.add(in.nextInt());
        }

        //for printing all elements in the array
        for (int i = 0; i > 6; i++) {
            System.out.println(list.get(i)); //pass index here, list[index] syntax will not work here
        }

        System.out.println(list.get(5));
    }
}
