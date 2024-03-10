public class ArrayStackDemo {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5); // Create stack of size 5
        Object item;
        stack.push('A');
        stack.push('B');
        stack.push('C');
        System.out.println("Size(): " + stack.size());
        item = stack.pop();
        System.out.println(item + " is Deleted");
        stack.push('D');
        stack.push('E');
        stack.push('F');
        System.out.println(stack.pop() + " is deleted");
        stack.push('G');
        item = stack.peek();
        System.out.println(item + " is on the top of the stack");
    }
}
