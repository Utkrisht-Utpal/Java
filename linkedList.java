public class linkedList {

  static class Node{
    int data;
    Node next;

    public Node(int data){
      this.data = data;
      this.next = null;
    }
  }

  static class LinkedList{
    Node head;
    
    public LinkedList(){
      this.head = null;
    }

    void create(int data){
      Node newNode = new Node(data);  
      if(head == null){
        head = newNode;
      }

      else{
        Node temp = head;
        while(temp.next != null){
          temp = temp.next;
        }
        temp.next = newNode;
      }
    }

    void printList(){
      Node temp = head;
      while(temp != null){
        System.out.print(temp.data + " -> ");
        temp = temp.next;
      }
      System.out.print("null");
    }
  }

  public static void main(String[] args) {
      LinkedList list = new LinkedList();

      list.create(10);
      list.create(20);
      list.create(30);

      System.out.println("Linked List elements:");
      list.printList();
  }
}