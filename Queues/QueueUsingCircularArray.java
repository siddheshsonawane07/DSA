package Queues;

/*Here the time complexity of both the operations are O(1)
*/
public class QueueUsingCircularArray {

    public static class Queue {
        int[] a;
        int n;
        int rear = -1;
        int front = -1;

        public Queue(int n) {
            this.n = n;
            a = new int[n];
        }

        void enqueue(int data){
            if((rear+1)%n == front){
                return;
            }
            if(front==-1){
                front = 0;
            }
            rear = (rear+1)%n;
            a[rear] = data;
        }

        int dequeue(){

            if(front == -1){
                return -1;
            }
            int result = a[front];

            if(front == rear){
                front = rear = -1;
            }
            else {
                front = (front+1)%n;
            }
            return result;
        }


        public static void main(String[] args) {
            Queue q1 = new Queue(5);
            q1.enqueue(5);
            q1.enqueue(4);
            q1.enqueue(3);
            q1.enqueue(2);
            q1.enqueue(1);
            System.out.println(q1.dequeue());
            System.out.println(q1.dequeue());
            System.out.println(q1.dequeue());
            System.out.println(q1.dequeue());
            System.out.println(q1.dequeue());
            System.out.println(q1.dequeue());
            System.out.println(q1.dequeue());
            System.out.println(q1.dequeue());
        }
    }
}
