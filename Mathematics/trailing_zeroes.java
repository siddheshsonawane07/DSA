package Mathematics;

import java.util.Scanner;
//calculate trailing zeroes in factorial

public class trailing_zeroes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        int res = 0;

        for (int i = 5; i <=a ; i = i*5) {
            res = res + (a/i);
        }

        System.out.println(res);

    }
}
