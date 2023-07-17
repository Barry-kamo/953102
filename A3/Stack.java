public class Stack {
    Node topNode; 

 
    public Stack() {
      topNode = null;
    }
  
   
    public void push(char a) {
      Node newNode = new Node(a); 
      newNode.next = topNode; 
      topNode = newNode;
    }
  
    
    public char pop() {
      if (isEmpty()) { 
        System.out.println("Stack is empty");
        return '\0'; 
      } else {
        char a = topNode.data; 
        topNode = topNode.next; 
        return a; 
      }
    }
  
    
    public char peek() {
      if (isEmpty()) { 
        System.out.println("Stack is empty");
        return '\0';
      } else {
        return topNode.data; 
      }
    }
  
    
    public boolean isEmpty() {
      return (topNode == null); 
    }
  }
  
 
  
