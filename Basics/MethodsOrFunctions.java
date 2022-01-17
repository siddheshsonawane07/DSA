package Basics;

import java.util.Scanner;

public class MethodsOrFunctions {
    public static void main(String[] args){
        int ans = sum_of_numbers();
        System.out.println(ans);
    }

    static int sum_of_numbers(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number 1");
        int num1 = input.nextInt();

        System.out.print("Enter Number 2");
        int num2 = input.nextInt();

        int sum = num1 + num2;

        return sum;
    }
}
