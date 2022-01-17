package Basics;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter 1 for Dollar to Rupee \nEnter 2 for Rupee to Dollar ");
        System.out.println("Enter here: ");

        int input = in.nextInt();

        if (input == 1){
            System.out.println("Enter dollars: ");
            double dollar = in.nextFloat();
            double dol_to_inr = dollar * 72.92;
            System.out.println(dol_to_inr);
        }

        else{
            System.out.println("Enter rupees: ");
            double rupee = in.nextFloat();
            double inr_to_dol = rupee / 72.92;
            System.out.println(inr_to_dol);
        }
    }
}
