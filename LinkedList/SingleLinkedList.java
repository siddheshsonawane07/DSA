package LinkedList;

public class SingleLinkedList {

    Node head;
    Node tail;
    public int size;

    SingleLinkedList(){
        this.size = 0;
    }

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    //adding node at start
    public void InsertFirst(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        if(tail == null){
            tail = head;
        }
        size++;
    }

    //adding node at last
    public void InsertLast(int val){
        if(tail == null){
            InsertFirst(val);
            return;
        }
        Node newNode = new Node(val);
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    //adding node at particular index
    public void InsertAt(int index, int val){
        if(index == 0){
            InsertFirst(val);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(val);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    //Deleting a node at first
    public void DeleteFirst(){
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
    }

    //Deleting a node at last
    public void DeleteLast(){
        if(size<=1){
            DeleteFirst();
        }
        Node SecondLast = get(size - 2);
        tail = SecondLast;
        tail.next = null;
        size--;
    }

    //Deleting a node at particular index
    public void DeleteAtIndex(int index){
        if(index == 0){
            DeleteFirst();
        }
        if(index == size - 1){
            DeleteLast();
        }
        Node previous = get(index -1);
        previous.next = previous.next.next;
        size--;
    }

    //Returning node for index given
    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    //Printing the linked list
    public void printList(){
       Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data +"->");
            currNode = currNode.next;
        }
        System.out.print("NULL");
    }

    //iterative approach for searching an element
    public boolean search(int val) {
        Node node = head;
        while (node != null) {
            if (node.data == val) {
                return true;
            }
            node = node.next;
        }
        return false;
    }

    //recursive approach for searching an element
    public boolean searchRecursive(int val){
        if (head == null){
            return false;
        }
        if(head.data == val){
            return true;
        }
        return searchRecursive(val);
    }

    //merging two lists
//    public Node MergeLists(Node l1, Node l2){
//
//        // Step 1: If any of the list is empty
//        if(l1 == null){
//            return l2;
//        }
//        else if(l2 == null){
//            return l1;
//        }
//
//
//        Node head1 = null;
//        // Step 2: Set the head of merged linked list
//        if(l1.data <= l2.data){
//            head1 = l1;
//            l1 = l1.next;
//        }
//        else{
//            head1 = l2;
//            l2 = l2.next;
//        }
//
//        Node current = head1;
//
//        // Step 3: Compare each node of both lists & start merging
//        while(l1 != null && l2 != null){
//
//            if(l1.data <= l2.data){
//                current.next = l1;
//                current = current.next;
//                l1 = l1.next;
//            }
//            else{
//                current.next = l2;
//                current = current.next;
//                l2 = l2.next;
//            }
//        }
//
//        // Step 4: If we reach the end of any list, merge it with the other list
//        current.next = (l1 != null) ? l1 : l2;
//
//        return head1;
//
//    }

    public int size(){
        return size;
    }

    public static void main(String[] args) {


    }

}
