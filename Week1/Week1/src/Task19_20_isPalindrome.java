
public class Task19_20_isPalindrome {
	static boolean isPalindrome(String argument){
		for(int j = 0; j < argument.length() ; j++){
			if( argument.charAt(j) != argument.charAt(argument.length() -1 -j)){
				return false;
			}
		}	
		
		return true;
	}
	
	static boolean isPalindrome(int argument){
		
		return isPalindrome(Integer.toString(argument));
	}
}
