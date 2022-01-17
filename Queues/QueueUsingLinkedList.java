package Queues;

public class QueueUsingLinkedList {

    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    static class Queue{
        Node front,rear;

        void enqueue(int data){
            Node newNode = new Node(data);
            if(front == null){
                front = rear = newNode;
                return;
            }
            rear.next = newNode;
            rear = newNode;
        }

        int dequeue(){
            if(front == null){
                return -1;
            }
            int result = front.data;
            front = front.next;
            return result;
        }

    }

    public static void main(String[] args) {
        Queue q1 = new Queue();
        q1.enqueue(4);
        q1.enqueue(3);
        q1.enqueue(2);
        q1.enqueue(1);
        int a = q1.dequeue();
        System.out.println("First in first out  "+ a);
        int b = q1.dequeue();
        System.out.println(b);
    }
}
