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

        System.out.println("enter left for  "  + data);
        root.left = createTree();

        System.out.println("enter right for  "  + data);
        root.right = createTree();

        return root;
    }

    static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + "");
    }

    public static void main(String[] args) {

        sc = new Scanner(System.in);

        Node root = createTree();
        System.out.println("inorder: ");
        inOrder(root);
        System.out.println("preorder: ");
        preOrder(root);
        System.out.println("postorder: ");
        postOrder(root);
    }
}
