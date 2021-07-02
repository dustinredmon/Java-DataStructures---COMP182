public class CircularQueue {

  private int[] data;
  private int queueSize;
  private int head, numberOfItems, tail = 0;
  private boolean isEmpty = true;
  private boolean isFull = false;
  
  public CircularQueue(int v){
    queueSize = v;
    data = new int[v];
  }
  
  public void enqueue(int v){
    if(numberOfItems + 1 <= queueSize){
      isEmpty = false;
      data[tail] = v;
      tail++;
      if (tail == queueSize) tail = 0;
      numberOfItems++;
      if (numberOfItems == queueSize) isFull = true;
      System.out.println(v + " Was Added to the Queue\n");

    } 
    else {
      System.out.println("Queue is Full\n");
      

    }

  }
  public int dequeue(){
    if(numberOfItems > 0){
      if (numberOfItems == queueSize) isFull = false;
      int temp = data[head];
      System.out.println(data[head] + " Was Removed From the Queue\n");
      head++;
      if (head == queueSize) head = 0;
      numberOfItems--;
      if (numberOfItems == 0) isEmpty = true;
      return temp;
    } 
    else {
      System.out.println("Queue is Empty\n");
      return 0;
    }

  }
  
  public boolean isEmpty(){
    return isEmpty;
  }
  
  public boolean isFull(){
    return isFull;
  }
  
}