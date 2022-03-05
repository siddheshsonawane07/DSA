package Trees.BT;
/*
Maximum number of nodes at level i is 2 * i
Maximum number of nodes in a tree with height h is 2^h-1
*/

import java.util.Scanner;


class Node {
    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;
    }
}

public class BT {

    static Scanner sc = null;

    static Node createTree() {
        Node root;

        System.out.println("Enter data");
        int data = sc.nextInt();

        if (data == -1) {
            return null;
        }

        root = new Node(data);

        System.out.println("enter left for  " + data);
        root.left = createTree();

        System.out.println("enter right for  " + data);
        root.right = createTree();

        return root;
    }

    static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    static int height(Node root){
        if (root == null) {
            return 0;
        }
        return Math.max(height(root.left),height(root.right)) + 1;
    }

    static int size(Node root){
        if(root==null){
            return 0;
        }
        return size(root.left) + size(root.right) + 1;
    }

    static int max(Node root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data, Math.max(max(root.left), max(root.right)));
    }

    public static void main(String[] args) {

        sc = new Scanner(System.in);

        Node root = createTree();
        System.out.print("inorder: ");
        inOrder(root);
        System.out.print("preorder: ");
        preOrder(root);
        System.out.print("postorder: ");
        postOrder(root);

        System.out.println();
        int height = height(root);
        System.out.println("height of tree is " + height);

        int size = size(root);
        System.out.println("size of tree is " + size);

        int max = max(root);
        System.out.println("max in tree is " + max);
    }
}
