public class Driver{
  static long startTime;
  static long endTime;
  static BNode root;

  public static void main(String[] args){
  
    BinaryTree myTree = new BinaryTree();
    
    //insert 100 nodes (iteration)
    startTime = System.currentTimeMillis();
    for ( int i = 0; i < 100; i++){
      myTree.addNode(i, "Data" + i);
    }
    endTime = System.currentTimeMillis();
    System.out.print("Add 100 nodes time: " + (endTime - startTime));
    System.out.println(" milliseconds");
    System.out.println();
    
    //delete 100 nodes (iteration)
    startTime = System.currentTimeMillis();
    for ( int i = 0; i < 100; i++){
      myTree.remove(i);
    }
    endTime = System.currentTimeMillis();
    System.out.print("Delete 100 nodes time: " + (endTime - startTime));
    System.out.println(" milliseconds");
    System.out.println();
    
    //insert 1000 nodes (iteration)
    startTime = System.currentTimeMillis();
    for ( int i = 0; i < 1000; i++){
      myTree.addNode(i, "Data" + i);
    }
    endTime = System.currentTimeMillis();
    System.out.print("Add 1000 nodes time: " + (endTime - startTime));
    System.out.println(" milliseconds");
    System.out.println();
    
    //delete 1000 nodes (iteration)
    startTime = System.currentTimeMillis();
    for ( int i = 0; i < 1000; i++){
      myTree.remove(i);
    }
    endTime = System.currentTimeMillis();
    System.out.print("Delete 1000 nodes time: " + (endTime - startTime));
    System.out.println(" milliseconds");
    System.out.println();
    
    //insert 10000 nodes (iteration)
    startTime = System.currentTimeMillis();
    for ( int i = 0; i < 10000; i++){
      myTree.addNode(i, "Data" + i);
    }
    endTime = System.currentTimeMillis();
    System.out.print("Add 10000 nodes time: " + (endTime - startTime));
    System.out.println(" milliseconds");
    System.out.println();
    
    //delete 10000 nodes (iteration)
    startTime = System.currentTimeMillis();
    for ( int i = 0; i < 10000; i++){
      myTree.remove(i);
    }
    endTime = System.currentTimeMillis();
    System.out.print("Delete 10000 nodes time: " + (endTime - startTime));
    System.out.println(" milliseconds");
    System.out.println();


    //retrieve root to pass through for recursive insert    
    root = myTree.getRoot();
    
    //insert 100 nodes (recursive)
    startTime = System.currentTimeMillis();
    for ( int i = 0; i < 100; i++){
      myTree.recursiveInsert(root, i, "Data" + i);
    }
    endTime = System.currentTimeMillis();
    System.out.print("Add 100 nodes time: " + (endTime - startTime));
    System.out.println(" milliseconds");
    System.out.println();
    
    //insert 1000 nodes (recursive)
    startTime = System.currentTimeMillis();
    for ( int i = 0; i < 1000; i++){
      myTree.recursiveInsert(root, i, "Data" + i);
    }
    endTime = System.currentTimeMillis();
    System.out.print("Add 1000 nodes time: " + (endTime - startTime));
    System.out.println(" milliseconds");
    System.out.println();
    
    //insert 10000 nodes (recursive)   
    startTime = System.currentTimeMillis();
    for ( int i = 0; i < 10000; i++){
      myTree.recursiveInsert(root, i, "Data" + i);
    }
    endTime = System.currentTimeMillis();
    System.out.print("Add 10000 nodes time: " + (endTime - startTime));
    System.out.println(" milliseconds");
    System.out.println();
        
    
    

  }
}