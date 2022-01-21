package Strings;

import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        //string declaration

        String name = "tony";
        String sentence = "my name is string";

        Scanner sc = new Scanner(System.in);

//        String s = sc.nextLine();
//        System.out.println("Your name is "+ s);

        //concatenation
//        String a = "Siddhesh";
//        String b = "Sonawane";
//        System.out.println(a+""+b);
//        System.out.println(b.length());

        //charAt
//        for (int i = 0; i < b.length(); i++) {
//            System.out.println(b.charAt(i));
//        }

        //comparing two strings

        String name1 = "Siddhesh";
        String name2 = "Siddhesh";

        //1 s1>s2 : +ve value
        //2 s1=s2 : 0
        //3 s1<s2 : -ve value

//        if(name1.compareTo(name2)==0){
//            System.out.println("Strings are equal");
//        }
//        else{
//            System.out.println("Strings are not equal");
//        }

        //in case of same number of characters in the string then strings are compared with their dissimilar characters serially, the string with greater character is the greater string

        //substring
//        String name3 = "ThisisSiddheshSonawane";
//        String sub = name3.substring(6,15);
//        System.out.println(sub);


        //Strings are the objects in JAVA

        //Strings are immutable


        //parseInt method of integer class
        String str1 = "123";
        int number1 = Integer.parseInt(str1);
        System.out.println(number1);

        int number2 = 123;
        String str2 = Integer.toString(number2);
        System.out.println(str2.length());

    }
}
