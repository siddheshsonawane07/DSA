package Trees.BT;
/*
Maximum number of nodes at level i is 2 * i
Maximum number of nodes in a tree with height h is 2^h-1
*/

import java.util.*;


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

        System.out.print("Enter data:  ");
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

    static int height(Node root) {
        if (root == null) {
            return 0;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    //check if the tree is balanced or not
    static int dfsHeight(Node root) {
        if (root == null) {
            return 0;
        }
        int leftH = dfsHeight(root.left);
        if (leftH == -1) {
            return -1;
        }
        int rightH = dfsHeight(root.right);
        if (rightH == -1) {
            return -1;
        }

        if (Math.abs(leftH - rightH) > 1) {
            return -1;
        }
        return Math.max(leftH, rightH) + 1;
    }


    //total number of nodes
    static int size(Node root) {
        if (root == null) {
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

    //zigzag traversal or spiral traversal
    static void printSpiralTraversal(Node node) {
        Stack<Node> mainStack = new Stack<>();
        mainStack.push(node);
        boolean ltr = true;

        Stack<Node> childStack = new Stack<>();

        while (mainStack.size() > 0) {
            node = mainStack.pop();
            System.out.print(node.data + " ");

            if (ltr) {
                if (node.left != null) {
                    childStack.push(node.left);
                }

                if (node.right != null) {
                    childStack.push(node.right);
                }
            } else {
                if (node.right != null) {
                    childStack.push(node.right);
                }
                if (node.left != null) {
                    childStack.push(node.left);
                }
            }

            if (mainStack.isEmpty()) {
                ltr = false;
                Stack<Node> temp = mainStack;
                mainStack = childStack;
                childStack = temp;
            }
        }
    }

    //anticlockwise boundary traversal
    //left boundary excluding leaf node
    //right boundary in reverse excluding leaf node
    static void printLeftBoundary(Node node) {
        if (node == null) {
            return;
        }
        if (node.left != null) {
            System.out.print(node.data + " ");
            printLeftBoundary(node.left);
        } else if (node.right != null) {
            System.out.println(node.data + " ");
            printLeftBoundary(node.right);
        }
    }

    static void printRightBoundary(Node node) {
        if (node == null) {
            return;
        }
        if (node.right != null) {
            printRightBoundary(node.right);
            System.out.print(node.data + " ");
        } else if (node.left != null) {
            printRightBoundary(node.left);
            System.out.println(node.data + " ");
            printLeftBoundary(node.left);
        }
    }

    static void printLeaves(Node node) {
        if (node == null)
            return;

        printLeaves(node.left);
        if (node.left == null && node.right == null)
            System.out.print(node.data + " ");
        printLeaves(node.right);
    }

    static void printBoundaryTraversalAnticlockwise(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");

        printLeftBoundary(node.left);
        printLeaves(node.left);
        printLeaves(node.right);
        printRightBoundary(node.right);
    }
    
    //root left right
    static void leftview(Node node, List<Integer> left, int currDepth) {
        if (node == null) {
            return;
        }
        if (currDepth == left.size()) {
            left.add(node.data);
        }
        leftview(node.left, left, currDepth + 1);
        leftview(node.right, left, currDepth + 1);

    }

    //root right left
    static void rightview(Node node, List<Integer> right, int currDepth) {
        if (node == null) {
            return;
        }
        if (currDepth == right.size()) {
            right.add(node.data);
        }
        rightview(node.right, right, currDepth + 1);
        rightview(node.left, right, currDepth + 1);
    }

    static int diameter;
    public static int calculateDiameter(Node node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = calculateDiameter(node.left);
        int rightHeight = calculateDiameter(node.right);

        diameter = Math.max(diameter, leftHeight + rightHeight);

        return Math.max(leftHeight, rightHeight) + 1;
    }


    public static void main(String[] args) {
//
//        sc = new Scanner(System.in);
//
//        Node root = createTree();
//        System.out.print("inorder: ");
//        inOrder(root);
//        System.out.println();
//        System.out.print("preorder: ");
//        preOrder(root);
//        System.out.println();
//        System.out.print("postorder: ");
//        postOrder(root);
//        System.out.println();
//
//        int height = height(root);
//        System.out.println("height of tree is " + height);
//
//        int dfs = dfsHeight(root);
//        System.out.println("is it a balanced tree: " + dfs);
//
//        int size = size(root);
//        System.out.println("size of tree is " + size);
//
//        int max = max(root);
//        System.out.println("max in tree is " + max);
//
//        int min = min(root);
//        System.out.println("min in tree is " + min);
//
//        int sum = sum(root);
//        System.out.println("sum of the nodes " + sum);
//
//        System.out.println("Level order traversal bruteforce approach: ");
//        printLevelOrder(root);
//
//        System.out.println();
//
//        System.out.println("Level order traversal using queue: ");
//        printLevelTraversal(root);
//
//        System.out.println("Zigzag traversal using queue: ");
//        printSpiralTraversal(root);
//
//        System.out.println();
//
//        System.out.println("Boundary Traversal anticlockwise: ");
//        printBoundaryTraversalAnticlockwise(root);
//
//        System.out.println();
//
//
//        List<Integer> right = new ArrayList<Integer>();
//        System.out.println("right view of binary tree");
//        rightview(root, right, 0);
//        System.out.println(right);
//
//        System.out.println();
//
//        List<Integer> left = new ArrayList<Integer>();
//        System.out.println("left view of binary tree");
//        leftview(root, left, 0);
//        System.out.println(left);




        sc = new Scanner(System.in);

        Node root = createTree();

        diameter = 0;
        int ans = calculateDiameter(root);
        System.out.println(diameter);



    }
}
