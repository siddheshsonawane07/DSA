package Trees.BST;

import java.util.ArrayDeque;
import java.util.Queue;


public class BST {

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    Node root;

    BST() {
        root = null;
    }

    void insert(int data) {
        root = insert(root, data);
    }

    Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else if (data <= root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    boolean search(Node root, int data) {
        if (root == null) {
            return false;
        } else if (root.data == data) {
            return true;
        } else if (data <= root.data) {
            return search(root.left, data);
        } else {
            return search(root.right, data);
        }
    }

    int findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root.data;

    }

    int findMax(Node root) {
        while (root.right != null) {
            root = root.right;
        }
        return root.data;
    }

    Node delete(Node root, int data) {
        if (root == null) {
            return null;
        } else if (data < root.data) {
            root.left = delete(root.left, data);
        } else if (data > root.data) {
            root.right = delete(root.right, data);
        } else {
            if (root.left == null && root.right == null) {
                root = null;
            } else if (root.left == null) {
                root = root.right;
            } else if (root.right == null) {
                root = root.left;

            } else {
                root.data = findMin(root.right);

            }
        }
        return root;
    }

    void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    //remove print add
    void level_order_traversal(Node node) {
        if (node == null) {
            return;
        }
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


    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(10);
        bst.insert(17);
        bst.insert(7);
        bst.insert(8);
        bst.insert(6);
        bst.insert(12);
        bst.insert(20);
        bst.level_order_traversal(bst.root);
        int min = bst.findMin(bst.root);
        System.out.println("Minimum number: " + min);
        int max = bst.findMax(bst.root);
        System.out.println("Maximum number: " + max);
        System.out.println("Inorder: ");
        bst.inorder(bst.root);
        System.out.println();
        bst.delete(bst.root, 6);
        System.out.println("After Deletion");
        bst.level_order_traversal(bst.root);
        boolean search = bst.search(bst.root, 20);
        System.out.println("is data present ? " + search);
    }

}