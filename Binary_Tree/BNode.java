class BNode {
  int key;
  String data;
  BNode leftChild;
  BNode rightChild;
  BNode(int key, String data) {
    this.key = key;
    this.data = data;
  }
  
  public String toString() {
    return data + " has the key " + key;
  }
}
