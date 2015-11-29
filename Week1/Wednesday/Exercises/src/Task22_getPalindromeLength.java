
public class Task22_getPalindromeLength {
	static int getPalindromeLength(String input){
		int index = input.indexOf('*');
		int conter = 0;
		
		for(int i = 0 ; i < index ; i++){
			int leftChar = index - 1 - i ;
			int rightChar = index + 2 + i;
			
			if(leftChar >= 0 && rightChar < input.length()){
				if(Task19_20_isPalindrome.isPalindrome(input.substring(leftChar, rightChar))){
					conter++;
				}
			}
		}
		
		return conter;
	}
}
