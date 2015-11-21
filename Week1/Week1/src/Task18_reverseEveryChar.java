
public class Task18_reverseEveryChar {
	static String reverseEveryChar(String arg){
		String[] words = arg.split("//s");
		
		StringBuilder result = new StringBuilder(arg.length());
		
		for(int i = 0 ; i < words.length ; i++){
			result.append(Task17_reverseString.reverseMe(words[i]));
		}
		
		return result.toString();
	}
}
