package LinkedList;

public class DoubleLinkedList {
    Node head;
    Node tail;
    public int size;

    DoubleLinkedList(){

        this.size = 0;
    }

    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void AddFirst(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        newNode.prev = null;
        if(head!=null){
            head.prev = newNode;
        }
        head = newNode;
        size++;
    }

    public void AddLast(int val){
        Node newNode = new Node(val);
        if(head == null){
            AddFirst(val);
            return;
        }
        Node last = head;
        while(last.next!=null){
            last = last.next;
        }
        last.next = newNode;
        newNode.prev = last;
    }

    public void InsertAt(int index, int val){
        if(index == 0){
            AddFirst(val);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(val);
        Node node = temp.next;
        newNode.next = temp.next;
        node.prev = newNode;
        newNode.prev = temp;
        temp.next = newNode;
        size++;
    }

    public void DeleteFirst(){
        head = head.next;
        head.prev = null;
    }

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
        previous.next.prev = previous;
        previous.next = previous.next.next;
        size--;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    public void printList() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.data + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");

//        System.out.println("Print in reverse");
//        while (last != null) {
//            System.out.print(last.data + " -> ");
//            last = last.prev;
//        }
//        System.out.println("START");
    }

    public int size(){
        return size;
    }

    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();

        list.AddFirst(5);
        list.AddLast(10);
        list.InsertAt(1,6);
        list.InsertAt(2,7);
        list.InsertAt(3,8);
//        list.printList();
        list.DeleteFirst();
        list.printList();
        list.DeleteLast();
        list.printList();
        list.DeleteAtIndex(1);
        list.printList();
    }
}
