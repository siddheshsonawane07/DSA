package Mathematics;


import java.util.Scanner;

public class MethodsPrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = in.nextInt();
        prime(num);

    }

    static void prime(int num){
        if (num % 2 == 0){
            System.out.println("Number is not prime number");
        }
        else {
            System.out.println("Number is prime number");
        }

    }
}
