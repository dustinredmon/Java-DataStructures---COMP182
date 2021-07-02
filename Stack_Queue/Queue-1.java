public class Queue{
  NodeSQ first, last;
  
  public NodeSQ peek(){
    if(first != null){
      return first;
    }
    return null;
  }
  
  public boolean enqueue(int value){
    NodeSQ enqueueTemp = new NodeSQ(value);
    if(first == null){
      first = enqueueTemp;
      last = first;
      return true;
    }
    else{
      last.next = enqueueTemp;
      last = enqueueTemp;
      return true;
    }
  }
  
  public NodeSQ dequeue(){
    if(first == null){
      return null;
    }
    else{
      NodeSQ dequeueTemp = new NodeSQ(first.value);
      first = first.next;
      return dequeueTemp;
    }   
  }
}
