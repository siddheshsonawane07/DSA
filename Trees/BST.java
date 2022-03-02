package Trees;

public class BST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }

    }

    public Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        }
        else if (data <= root.data) {
            root.left = insert(root.left, data);
        }
        else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public boolean search(Node root, int data) {
        if(root == null) {
            return false;
        }
        else if (root.data == data) {
            return true;
        }
        else if (data <= root.data) {
            return search(root.left, data);
        }
        else {
            return search(root.right, data);
        }
    }

    public int findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root.data;

    }

    public int findMax(Node root){
        while (root.right != null){
            root = root.right;
        }
        return root.data;
    }

    public Node delete(Node root, int data) {
        if(root == null) {
            return null;
        }
        else if (data < root.data) {
            root.left = delete(root.left, data);
        }
        else if (data > root.data) {
            root.right = delete(root.right, data);
        }
        else {
            if(root.left == null && root.right == null) {
                root = null;
            }
            else if (root.left == null) {
                root = root.right;
            }
            else if (root.right == null) {
                root = root.left;

            }
            else {
                root.data = findMin(root.right);

            }
        }
        return root;
    }

    public static void main(String[] args) {

    }
}
