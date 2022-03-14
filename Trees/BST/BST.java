package Trees.BST;

import Queues.QueueUsingArrays;

import java.util.ArrayDeque;
import java.util.Queue;

public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static void insert(Node node, int data) {
        if (node == null) {
            System.out.println("Node cannot be null");
        }
        Node cur = node;
        while (true) {
            if (cur.data <= data) {
                if (cur.right != null) {
                    cur = cur.right;
                } else {
                    cur.right = new Node(data);
                    break;
                }
            } else {
                if (cur.left != null) {
                    cur = cur.left;
                } else {
                    cur.left = new Node(data);
                    break;
                }
            }
        }
    }

    static boolean search(Node node, int data) {
        if (node == null) {
            return false;
        } else if (node.data == data) {
            return true;
        } else if (data <= node.data) {
            return search(node.left, data);
        } else {
            return search(node.right, data);
        }
    }

    //Node with the smallest data larger than or equal to the key value.
    static int ceil(Node node, int key) {
        int ceil = -1;
        while (node != null) {
            if (node.data == key) {
                ceil = node.data;
                return ceil;
            }
            if (key > node.data) {
                node = node.right;
            } else {
                ceil = node.data;
                node = node.left;
            }
        }
        return ceil;
    }

    //Node with the greatest data lesser than or equal to the key value.
    static int floor(Node node, int key) {
        int floor = -1;
        while (node != null) {
            if (node.data == key) {
                floor = node.data;
                return floor;
            }
            if (key > node.data) {
                floor = node.data;
                node = node.right;
            } else {
                node = node.left;
            }
        }
        return floor;
    }

    static int height(Node root) {
        if (root == null) {
            return 0;
        }
        return Math.max(height(root.left), height(root.right));
    }

    static void level_order_traversal(Node root) {
        if (root == null) {
            System.out.println("Tree is empty");
        }
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);

        //remove print add
        while (queue.size() > 0) {
            int count = queue.size();
            for (int i = 0; i < count; i++) {
                root = queue.remove();
                System.out.println(root.data + " ");
            }
            if (root.left != null) {
                queue.add(root.left);
            }

            if (root.right != null) {
                queue.add(root.right);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node root = new Node(1);

    }
}
