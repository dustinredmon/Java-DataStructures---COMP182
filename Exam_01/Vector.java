public class Vector{
  private int size;
  private int capacity;
  private int[] array;
  private int[] newArray;
  
  public Vector(int capacity){
    this.size = 0;
    this.array = new int[capacity];
  }
  public void insertAtEnd( int data ){
    if (size == array.length){
      this.newArray = new int[array.length * 2];
      for (int i = 0; i < size; i++){
        newArray[i] = array[i];
      }
      array = newArray;
    }
    array[size] = data;
    size++;
  }
  public int removeAtFront(){
    if (size == 0) {
      System.out.println("Cannot delete. Vector is empty");
      return -1;
    }
    else{
      int dataDeleted = array[0];
      for (int i =0; i < size ; i++){
        array[i] = array [i+1];
        size--;
      }
      if (size <= array.length / 4){
        this.newArray = new int[array.length / 2];
        for (int i = 0; i < size; i++){
          newArray[i] = array[i];
        }
        array = newArray;
      }
      return dataDeleted;
    }
  }
  
  public String toString(){
    String vectorString = "";
    if (size == 0){
      vectorString = "empty string";
      return vectorString;
    }
    else {
      for (int i=0; i < size; i++){
      vectorString += array[i] + " ";
      }
      return vectorString;
    }
  }
}