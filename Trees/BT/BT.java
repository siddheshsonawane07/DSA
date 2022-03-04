package Trees.BT;
/*
Maximum number of nodes at level i is 2 * i
Maximum number of nodes in a tree with height h is 2^h-1
*/


import java.util.Scanner;

class Node{
    Node left, right;
    int data;

    public Node(int data){
        this.data = data;
    }
}

public class BT {

    static Scanner sc = null;

    static Node createTree(){
        Node root = null;

        System.out.println("Enter data");
        int data = sc.nextInt();

        if(data==-1){
            return null;
        }

        root = new Node(data);

        System.out.println("enter left for"+ data);
        root.left = createTree();

        System.out.println("enter right for"+ data);
        root.right = createTree();

        return root;
    }

    public static void main(String[] args) {

    }
}
