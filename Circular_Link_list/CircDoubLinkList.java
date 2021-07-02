public class CircDoubLinkList {

  public int size =0;
  public CircNode head=null;
  public CircNode tail=null;
  static long startTime;
  static long endTime;

  //add a new node at the start of the linked list
  public void insertAtFront(int data){
    CircNode newLink = new CircNode(data);
    if(size==0){
      head = newLink;
      tail = newLink;
      newLink.next = head;
      newLink.prev = tail;
    }
    else{
      head.prev = newLink;
      newLink.next = head;
      newLink.prev = tail;
      head = newLink;
      tail.next = head;
    }
      size++;
  }
  public void deleteAtFront(){
    if(size==0){
      System.out.println("\nList is Empty");
    }
    else{
      head = head.next;
      head.prev = tail;
      tail.next = head;
      size--;
    }
  }
  
  public void display(){
    CircNode temp = head;
    System.out.println("Contents of Link List: ");
    for ( int i = 0; i < size; i++ ){
      temp.display();
      temp = temp.next;
    }
    System.out.println("");
  }
  
  public static void main(String[] args) {
    CircDoubLinkList cDoubLinkList = new CircDoubLinkList();
    startTime = System.currentTimeMillis();
    for ( int i = 0; i < 100; i++){
      cDoubLinkList.insertAtFront(i);
    }
    endTime = System.currentTimeMillis();
    cDoubLinkList.display();
    System.out.print("Add 100 nodes time: " + (endTime - startTime));
    System.out.println(" milliseconds");
    System.out.println();
    startTime = System.currentTimeMillis();
    for ( int i = 0; i < 100; i++){
      cDoubLinkList.deleteAtFront();
    }
    endTime = System.currentTimeMillis();
    cDoubLinkList.display();
    System.out.print("Delete 100 nodes time: " + (endTime - startTime));
    System.out.println(" milliseconds");
    System.out.println();
    startTime = System.currentTimeMillis();
    for ( int i = 0; i < 1000; i++){
      cDoubLinkList.insertAtFront(i);
    }
    endTime = System.currentTimeMillis();
    cDoubLinkList.display();
    System.out.print("Add 1000 nodes time: " + (endTime - startTime));
    System.out.println(" milliseconds");
    System.out.println();
    startTime = System.currentTimeMillis();
    for ( int i = 0; i < 1000; i++){
      cDoubLinkList.deleteAtFront();
    }
    endTime = System.currentTimeMillis();
    cDoubLinkList.display();
    System.out.print("Delete 1000 nodes time: " + (endTime - startTime));
    System.out.println(" milliseconds");
    System.out.println();
    startTime = System.currentTimeMillis();
    for ( int i = 0; i < 10000; i++){
      cDoubLinkList.insertAtFront(i);
    }
    endTime = System.currentTimeMillis();
    cDoubLinkList.display();
    System.out.print("Add 10000 nodes time: " + (endTime - startTime));
    System.out.println(" milliseconds");
    System.out.println();
    startTime = System.currentTimeMillis();
    for ( int i = 0; i < 10000; i++){
      cDoubLinkList.deleteAtFront();
    }
    endTime = System.currentTimeMillis();
    cDoubLinkList.display();
    System.out.print("Delete 10000 nodes time: " + (endTime - startTime));
    System.out.println(" milliseconds");
    System.out.println();
    startTime = System.currentTimeMillis();
    for ( int i = 0; i < 100000; i++){
      cDoubLinkList.insertAtFront(i);
    }
    endTime = System.currentTimeMillis();
    cDoubLinkList.display();
    System.out.print("Add 100000 nodes time: " + (endTime - startTime));
    System.out.println(" milliseconds");
    System.out.println();
    startTime = System.currentTimeMillis();
    for ( int i = 0; i < 100000; i++){
      cDoubLinkList.deleteAtFront();
    }
    endTime = System.currentTimeMillis();
    cDoubLinkList.display();
    System.out.print("Delete 100000 nodes time: " + (endTime - startTime));
    System.out.println(" milliseconds");
  }
}