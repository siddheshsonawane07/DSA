package Collections_Framework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLists {

    //dynamic arrays
    //array is copied into a new array with greater size
    //if the initial size of the array is n, it increases the array size to n + (n/2) + 1

    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> surnmae = new ArrayList<>();
        //append at the end;
        name.add("Siddhesh");
        name.add("Rush");
        //method overloading
        name.add(1, "Tan");

        //adding whole array
        name.addAll(surnmae);

        //remove using index
        //name.remove(1);
        //remove using value
        name.remove(String.valueOf("Tan "));
        System.out.println(name);

        //updating the value
        name.set(0, "Ank");

        //deleting the whole array
        name.clear();

        //iterator
        Iterator<String> it = name.iterator();
        while (it.hasNext()) {
            System.out.println("iterator" + it.next());
        }

    }

}
