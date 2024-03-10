public class ArrayQueueDemo {
    public static void main(String[] args) {
        ArrayQueue myQueue = new ArrayQueue(5);
        Object item;
        myQueue.insert('A');
        myQueue.insert('B');
        myQueue.insert('C');
        myQueue.displayAll();
        item = myQueue.remove();
        System.out.println(item + " is deleted!");
        myQueue.displayAll();
        myQueue.insert('D');
        myQueue.insert('E');
        myQueue.insert('F');
        myQueue.displayAll();
        item = myQueue.remove();
        System.out.println(item + " is deleted!");
        myQueue.displayAll();
        System.out.println( "Peek : " + myQueue.peek());
        myQueue.displayAll();
        myQueue.insert('G');
        myQueue.displayAll();
        myQueue.insert('H');
        myQueue.displayAll();
        System.out.println( "Queue size : " + myQueue.size());
    }
}
