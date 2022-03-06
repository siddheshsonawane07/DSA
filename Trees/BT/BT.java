package Trees.BT;
/*
Maximum number of nodes at level i is 2 * i
Maximum number of nodes in a tree with height h is 2^h-1
*/

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
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

    //total number of nodes
    static int size(Node root){
        if(root==null){
            return 0;
        }
        return size(root.left) + size(root.right) + 1;
    }

    static int max(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data, Math.max(max(root.left), max(root.right)));
    }

    static int min(Node root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        return Math.min(root.data, Math.min(min(root.left), min(root.right)));
    }

    static int sum(Node root) {
        if (root == null) {
            return 0;
        }
        int lsm = sum(root.left);
        int rsm = sum(root.right);

        int tsm = lsm + rsm + root.data;
        return tsm;
    }

    //level order traversal using bruteforce approach
    static void printLevelOrder(Node root) {
        int h = height(root);
        for (int i = 0; i <= h; i++) {
            printCurrentLevel(root, i);
        }
    }

    static void printCurrentLevel(Node root, int i) {
        if (root == null) {
            return;
        }
        if (i == 1) {
            System.out.print(root.data + " ");
        } else if (i > 1) {
            printCurrentLevel(root.left, i - 1);
            printCurrentLevel(root.right, i - 1);
        }
    }

    //level order traversal using queues
    // remove print add
    static void printLevelTraversal(Node node) {
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(node);

        while (queue.size() > 0) {
            int count = queue.size();
            for (int i = 0; i < count; i++) {
                node = queue.remove();
                System.out.print(node.data + " ");

                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            System.out.println();
        }

    }

    static int max = 0;

    static void leftview(Node node, int level) {
        if (node == null)
            return;

        if (max < level) {
            System.out.print(" " + node.data);
            max = level;
        }

        leftview(node.left, level + 1);
        leftview(node.right, level + 1);
    }

    static void rightview(Node node, int level) {
        if (node == null) {
            return;
        }
        if (max < level) {
            System.out.print(" " + node.data);
            max = level;
        }

        rightview(node.right, level + 1);
        rightview(node.left, level + 1);

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

        int min = min(root);
        System.out.println("min in tree is " + min);

        int sum = sum(root);
        System.out.println("sum of the nodes " + sum);

        System.out.println("Level order traversal bruteforce approach: ");
        printLevelOrder(root);

        System.out.println();

        System.out.println("Level order traversal using queue: ");
        printLevelTraversal(root);

    }
}
