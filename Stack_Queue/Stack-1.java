public class Stack{
  NodeSQ topOfStack;
  
  public NodeSQ top(){
    if(topOfStack != null){
      return topOfStack;
    }
    return null;
  }
  
  public NodeSQ pop(){
    if(topOfStack == null){
      return null;
    }
    else{
      NodeSQ popTemp = new NodeSQ(topOfStack.value);
      topOfStack = topOfStack.next;
      return popTemp;   
    }
  }
  
  public boolean push(int value){
    NodeSQ pushTemp = new NodeSQ(value);
    pushTemp.next = topOfStack;
    topOfStack = pushTemp;
    return true;
  }
}
