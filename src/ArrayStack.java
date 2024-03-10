/* Stacks in Data Structures is a linear type of data structure that follows
the LIFO (Last-In-First-Out) principle and allows insertion and deletion
operations from one end of the stack data structure, that is top. Implementation
of the stack can be done by contiguous memory which is an array, and non-contiguous
memory which is a linked list. Stack plays a vital role in many applications.*/

public class ArrayStack implements Stack{
    private Object a[];
    private int top; // stack top
    
    public ArrayStack( int n){
        a = new Object[n]; // create stack array
        top = -1; // no items in the stack
    }
    public void push( Object item){
        if(top == a.length-1){
            System.out.println("The Stack is full!");
            return;
        }
        top ++;
        a[top] = item; // insert an item
    }
    public Object pop(){ // remove item from the stack
        if(isEmpty()){
            System.out.println("Stack is empty!");
            return null;
        }
        Object item = a[top];
        top --;
        return item;
    }
    public Object peek(){
        if( isEmpty()){
            return null;
        }
        return a[top];
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public int size(){
        return top +1;
    }
}