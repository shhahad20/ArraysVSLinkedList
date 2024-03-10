public class ArrayQueue implements Queue {
    private Object que[];
    private int front;
    private int maxSize;
    private int count;
    private int rear;

    public ArrayQueue(int s) { // Constructor
        maxSize = s;
        que = new Object[maxSize];
        front = rear = -1;
        count = 0;
        System.out.println("Front " + front + " | Rear: "+ rear+ " | Count: " + count);

    }

    public void insert(Object item) { // add item at rear of queue
        if (count == maxSize) {
            System.out.println("Queue is full");
            return;
        }
        if (rear == maxSize - 1 || rear == -1) { 
            que[0] = item;
            rear = 0;
            count ++;
            if (front == -1) {
                front = 0;
            }
            System.out.println("Front " + front + " | Rear: "+ rear+ " | Count: " + count);
        }
        else{
            que[++rear] = item; 
            count++; // update the queue size
            System.out.println("Front " + front + " | Rear: "+ rear+ " | Count: " + count);
        }
    }
    public Object remove(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return 0;
        }
        Object tmp = que[front]; // save item to be deleted
        que[front] = null;
        if(front == rear){
            rear = front = -1;    
        }
        else if(front == maxSize -1){
            front = 0; 
        }else{
            front ++;
        }
        count --;
        System.out.println("Front " + front + " | Rear: "+ rear+ " | Count: " + count);
        return tmp;
    }
    public Object peek(){
        return que[front];
    }
    public boolean isEmpty(){
        return (count == 0);
    }
    public int size(){
        return count;
    }
    public void displayAll(){
        System.out.println("Queue: ");
        for(int i =0; i < maxSize; i++){
            System.out.print(que[i] + " ");
        }
        System.out.println();
    }
}
