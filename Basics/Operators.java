package Basics;

public class Operators {
    public static void main(String[] args) {
        /*
        Binary Operators
         +  Addition
         -  Subtraction
         *  Multiplication
         /  Division
         %  Modulo

        Unary Operators
        ++a  pre-increment  First value is changed, and then it is used
        a++  post-increment  First value is used, and then it changed
        --a  pre-decrement
        a--  post-decrement

        Relational Operators
        ==
        !=
        >
        <
        >=
        <=

        Logical Operators
        &&   Logical AND
        ||   Logical OR
        !    Logical NOT

        Bitwise Operators
        &  Binary AND
        All values must be true for True

        |  Binary OR
        Either of the value must be true for True

        ^  Binary XOR
        Different Values => true,  Same Values => False

        ~  Binary One's Complement
        1=>0, 0=>1

        << Binary Left Shift
        a<<1
        0101
        1010

        a<<2
        0101
        0100

        >> Binary Right Shift
        a>>1
        0101
        0010

        a>>2
        0101
        0001

        Assignment Operators
        =
        +=
        -=
        *=
        /=

         */


        int a = 10;
        int b = 0;
        int c = a++;
        int d = ++a;
        System.out.println(c);
//        System.out.println(d);

    }
}
