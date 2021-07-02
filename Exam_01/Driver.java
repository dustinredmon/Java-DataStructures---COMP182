public class Driver{

  public static void main(String[] args){
    Vector myVector = new Vector(1);
    myVector.removeAtFront();
    System.out.println(myVector.toString());
    myVector.insertAtEnd(10);
    myVector.insertAtEnd(20);
    myVector.insertAtEnd(30);
    myVector.insertAtEnd(40);
    myVector.insertAtEnd(50);
    myVector.insertAtEnd(60);
    System.out.println(myVector.toString());
    myVector.removeAtFront();
    System.out.println(myVector.toString());
  }
}