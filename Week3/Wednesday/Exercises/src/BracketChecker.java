import java.util.Stack;

public class BracketChecker {
	public static boolean checker(String str){
		Stack<Character> st = new Stack<Character>();
		
		for(int i = 0; i < str.length() ; i++){
			if(str.charAt(i) == '('){
				st.push('(');
			}
			
			if(str.charAt(i) == ')'){
				if(st.isEmpty()){
					return false;
				}
				st.pop();
			}
		}
		
		if(st.isEmpty()){
			return true;
		}
		
		return false;
		
	}
}
