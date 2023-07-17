import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class tset {


    public static void main(String[] args)throws IOException {
		
        String fileName = "C:/Users/13512/Downloads/input.txt";
        Path path = Paths.get(fileName);//
        String content=Files.readString(path);
		String[] parts = content.split("\n\r");

		//part1
		String part1 = parts[0]; 
		System.out.println("Expression 1: "+"Infix exp:"+"\n"+part1);
		System.out.println("Postfix exp: 1: "+"\n"+infixToPostfix(part1));
		System.out.println("\n");

		//part2
		String part2 = parts[1]; 
		System.out.print("Expression 2: "+"Infix exp:");
		System.out.println(part2);
		System.out.println("Postfix exp: 2: "+"\n"+infixToPostfix(part2));
 

    }

    public static boolean isOperand(char a) {
    	return (a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z')||(a >= '0' && a <= '9');
  	}


  	public static int precedence(char a2) {
    	switch(a2) {
      		case '+':
      		case '-':
        		return 1;
      		case '*':
      		case '/':
      		case '%':
        		return 2;
      		case '^':
            	return 3;
    	}
    	return -1;
  	}

  
  	public static String infixToPostfix(String aa){
		String postfix = ""; 

    	Stack a = new Stack();

    	for(int A =0;A<aa.length();A++){ 
			char a1 = aa.charAt(A);
            if(isOperand(a1)){ 

        		postfix += a1; 
      		}else if(a1 == '('){ 
        		a.push(a1);  
      		}else if(a1 == ')'){ 
				while(!a.isEmpty() && a.peek() != '('){ 
          			postfix += a.pop(); 
        		} 	
				if(!a.isEmpty() && a.peek()!='('){ 
          			return "Invalid Expression";  
        		}else  { 
          			a.pop(); 
        		} 
                

     		}else{

       			while(!a.isEmpty() && precedence(a1)<=precedence(a.peek())){ 
          			
					postfix += a.pop();  
       			} 
				a.push(a1);  
     		}

   		}

   		while(!a.isEmpty()){  

     		postfix += a.pop();  





   		}
		return postfix;

 	}
}
