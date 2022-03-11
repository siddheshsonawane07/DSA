package Trees.BST;

public class BST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }

    }

    static boolean search(Node root, int data) {
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

    static int ceil(Node root, int key) {
        return 0;
    }

    public static void main(String[] args) {

    }
}
