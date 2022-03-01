package Queues;

public class QueueUsingArrays {

    public static class Queue{
        int[] a;
        int capacity;
        int rear;
        public Queue(int n){
            capacity = n;
            a = new int[n];
            rear = -1;
        }

        void enqueue(int data){
            if(rear==capacity-1){
                System.out.println("The queue is full");
            }
            rear++;
            a[rear] = data;
        }

        int dequeue(){
            if(rear==-1){
                return -1;
            }
            int result = a[0];
            for (int i = 0; i < rear; i++) {
                a[i] = a[i+1];
            }
            rear--;
            return result;
        }

        void get_front(){
            if(rear==-1){
                System.out.println("List is empty");
            }
            int b = a[0];
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        Queue q1 = new Queue(5);

    }

}
