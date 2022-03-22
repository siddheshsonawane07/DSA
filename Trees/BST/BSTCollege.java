package Trees.BST;

public class BSTCollege {

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    Node root;

    BSTCollege() {
        root = null;
    }

    Node insert(Node node, int data) {
        if (node == null) {
            return new Node(data);
        } else if (data <= node.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }

        return node;
    }

    public static void main(String[] args) {

    }
}
