package Collections_Framework;

import java.util.Stack;

public class stacks {
    //last in first out

    public static void main(String[] args) {

        Stack<String> anime = new Stack<>();

        anime.push("Naruto");
        anime.push("Naruto Shippuden");
        System.out.println(anime.peek());

        anime.pop();
        System.out.println(anime.peek());
    }
}
