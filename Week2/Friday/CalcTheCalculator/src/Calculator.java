import java.util.Scanner;
import java.util.Stack;

public class Calculator {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hello!\n\n");
		String inp = null;
		while(true){
			System.out.print("Enter expression:> ");
			inp = input.nextLine();
			if(Balanced(inp)){
				
			}else{
				System.out.println("Invalid input!");
			}
		}
	}
	
	private static double calculator(String eq){
		int indexOpenBracket = eq.lastIndexOf("(");
		int indexCloseBracket = eq.indexOf(")");
		
		if(indexOpenBracket != -1 && indexCloseBracket != -1){
			String subStr = eq.substring(indexOpenBracket, indexCloseBracket+1);
			double result = calculator(subStr);
			StringBuilder newEq = new StringBuilder();
			if(indexOpenBracket > 0){
				newEq.append(eq.substring(0,indexOpenBracket -1));
			}
			
			newEq.append(result);
			
			if(indexCloseBracket< eq.length() -1){
				newEq.append(eq.substring(indexCloseBracket +2, eq.length() -1));
			}
			
			eq = newEq.toString();
		}
	}
	
	public static boolean Balanced(String input){
        Stack<Character> stack = new Stack<Character>();

        for(char ch : input.toCharArray()){
            switch(ch) {
                case '(':{
                    stack.push(ch);
                    break;
                }
                case ')':{
                    if(stack.isEmpty() || stack.pop() != '('){
                        return false;
                    }
                    break;
                }
            }
        }
        return stack.isEmpty();
    }
}
