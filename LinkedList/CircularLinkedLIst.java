package LinkedList;

public class CircularLinkedLIst {

    Node head;
    Node tail;
    public int size;

    CircularLinkedLIst(){
        this.size =0;
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

    public void insert(int val){
        Node newNode = new Node(val);
            if(head==null){
                head = newNode;
                tail = newNode;
                return;
            }
            tail.next= newNode;
            newNode.next = head;
            tail = newNode;
    }

    public void delete(int val) {
        Node newNode = head;
        if (newNode == null) {
            return;
        }

        if (newNode.data== val) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node temp = newNode.next;
            if (temp.data == val) {
                newNode.next = temp.next;
                break;
            }
            newNode = newNode.next;
        } while (newNode != head);

    }
    public void print() {
        Node newNode = head;
        if (head != null) {
            do {
                System.out.print(newNode.data + " -> ");
                newNode = newNode.next;
            } while (newNode != head);
        }
        System.out.println("HEAD");
    }

    public static void main(String[] args) {
        CircularLinkedLIst list  = new CircularLinkedLIst();

        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.print();
        list.delete(15);
        list.print();
    }
}
