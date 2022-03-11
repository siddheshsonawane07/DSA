package Trees.BST;

public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        Node cur = root;
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

        return root;
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

    public static void main(String[] args) {
        Node root = new Node(1);

    }
}
