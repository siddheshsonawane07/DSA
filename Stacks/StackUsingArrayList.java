package Stacks;

import java.util.ArrayList;

public class StackUsingArrayList {
    static class Stack{
        ArrayList<Integer> list = new ArrayList<>();

        public boolean isEmpty(){
            return list.size() == 0;
        }

        public void push(int data){
            list.add(data);
        }

        public void pop(){
            if(isEmpty()){
                return;
            }
            list.remove(list.size()-1);
        }

        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }

    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push(5);
        s1.push(4);
        s1.push(3);
        s1.push(2);
        s1.push(1);

        while(!s1.isEmpty()){
            System.out.println(s1.peek());
            s1.pop();
        }
    }
}
