
public class Task31_findConsonants {
	
	static long countConsonants(String arg){
		String text = arg.replaceAll("[^a-zA-Z]", "");
		long vowelsCount = Task30_findVowels.countVowels(text);
				
		return text.length() - vowelsCount; 
	}
}
