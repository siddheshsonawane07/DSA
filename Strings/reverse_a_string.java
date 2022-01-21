package Strings;

import java.util.Scanner;

public class reverse_a_string {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");

        for(int i = 0; i < sb.length()/2; i++){
            int front = i;
            int back = sb.length() - 1 - i;

            char frontchar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(front, backChar);
            sb.setCharAt(back,frontchar);
        }

        System.out.println(sb);
    }
}
