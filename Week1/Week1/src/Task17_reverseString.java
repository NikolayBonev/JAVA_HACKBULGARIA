
public class Task17_reverseString {
	static String reverseMe(String argument){
		StringBuilder arg = new StringBuilder(argument.length());
		
		for(int i = argument.length() - 1; i>= 0 ; i--){
			arg.append(argument.charAt(i));
		}
		
		return arg.toString();
	}
}
