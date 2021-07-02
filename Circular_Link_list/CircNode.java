class CircNode{
    int data;
    CircNode next;
    CircNode prev;
    public CircNode(int data){
        this.data = data;
    }
    public void display(){
      System.out.print(data + " ");
    }
}