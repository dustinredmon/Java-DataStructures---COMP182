public class DriverStackQueue{

  public static void main(String[] args){
    Stack myStack = new Stack();
    System.out.println(myStack.pop());
    System.out.println(myStack.push(5));
    System.out.println(myStack.push(10));
    System.out.println(myStack.push(15));
    System.out.println(myStack.pop().value);
    System.out.println(myStack.top().value);
    System.out.println(myStack.pop().value);
    System.out.println(myStack.pop().value);
    System.out.println(myStack.pop());
    System.out.println(myStack.top());
    
    System.out.println();
    
    Queue myQueue = new Queue();
    System.out.println(myQueue.dequeue());
    System.out.println(myQueue.enqueue(17));
    System.out.println(myQueue.enqueue(18));
    System.out.println(myQueue.enqueue(19));
    System.out.println(myQueue.dequeue().value);
    System.out.println(myQueue.peek().value);
    System.out.println(myQueue.dequeue().value);
    System.out.println(myQueue.dequeue().value);
    System.out.println(myQueue.dequeue());
    System.out.println(myQueue.peek());
  }
}