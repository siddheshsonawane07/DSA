package Basics;

import java.util.Scanner;

public class MethodsVoting {

    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter age");
        int age = in.nextInt();
        voting_age(age);
        // here age is variable
    }

    static void voting_age(int age){
//        here age is parameter, it can be different than the above variable
        if (age >= 18){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("You are not eligible to vote");
        }
    }
}
