package Mathematics;

import java.util.Scanner;

public class factorial {

    static int factorial1(int n){
        if (n == 0) {
            return 1;
        }
        else {
            return (n * factorial1(n - 1));
        }
    }

    static void factorial(int n){
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int fact = 1;

        for(int i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number1= in.nextInt();
        int fact1 = factorial1(number1);
        System.out.println("Factorial of "+number1+" is: "+fact1);

    }
}
