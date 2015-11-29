
public class Task24_decodeUrl {
	static String decodeUrl(String input){

		input = input.replaceAll("%20", " ");
		input = input.replaceAll("%3A", ":");
		input = input.replaceAll("%3D", "?");
		input = input.replaceAll("%2F", "/");
		
		return input;
	}
}
