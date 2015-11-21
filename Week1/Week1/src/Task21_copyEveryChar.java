
public class Task21_copyEveryChar {
	static String copyEveryChar(String input, int k){
		StringBuilder result = new StringBuilder(input.length()*k);
		
		for(int i = 0 ; i < input.length() ; i++){
			for(int j = 0 ; j < k ; j++){
				result.append(input.charAt(i));
			}
		}
		
		return result.toString();
	}
}
