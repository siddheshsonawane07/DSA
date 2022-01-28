package Mathematics;


import java.util.Scanner;

public class MethodsSumOfFirstN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number till which you would like to add");
        int n = in.nextInt();
        double b = Sum_of_N(n);
        System.out.println(b);
    }

    static double Sum_of_N(int n){
       double sum = 0;

        while (n>0){
            sum+=n;
            n--;
       }

        return sum;
    }
}
