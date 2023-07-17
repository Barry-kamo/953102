import java.util.Arrays;

public class Tutorial5 {
    public static class TheStack {
	
        private int maxSize;
        private int[] stackArray; 
        private int top;
    
        public TheStack(int size) {
            maxSize = size;
            stackArray = new int[maxSize];	     
            top = -1;
        }
        
        public void push(int value) {
            stackArray[++top] = value;
        }

        public int pop(){
            int x=stackArray[top--];
            stackArray[top+1]=0;
            return x;
            
        }

        public int peek(){
            return stackArray[top];
        }

        public boolean isEmpty(){
            return (top == -1);
        }

        public boolean isFull(){
            return (top == maxSize - 1);
        }
    
        @Override
        public String toString() {
            return "MyStack [stackArray=" + Arrays.toString(stackArray) + "]";
        }
        
    }
    public static void main(String[] args) {
    TheStack myStack = new TheStack(9);
    myStack.push(6);
    myStack.push(4);
    myStack.push(2);
    myStack.push(1);
    myStack.push(1);
    myStack.push(5);
    myStack.push(5);
    myStack.push(0);
    myStack.push(2);

    System.out.println(myStack.peek());
    System.out.println(myStack.pop());
    System.out.println(myStack.pop());
    System.out.println(myStack.pop());
    System.out.println(myStack.pop());
    System.out.println(myStack.pop());
    System.out.println(myStack.toString());

    }
}
    