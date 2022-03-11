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

    public static void main(String[] args) {

    }
}
