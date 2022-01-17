package Stacks;

import java.util.Stack;

public class StackUsingFramework {

    public static void pushAtBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data,s);
        s.push(top);
    }


    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(5);
        s1.push(4);
        s1.push(3);
        s1.push(2);
        s1.push(1);

        pushAtBottom(10,s1);

        while(!s1.isEmpty()){
            System.out.println(s1.peek());
            s1.pop();
        }
    }
}
