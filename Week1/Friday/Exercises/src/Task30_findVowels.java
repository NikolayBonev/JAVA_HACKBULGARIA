
public class Task30_findVowels {
	
	static long countVowels(String arg){
		
		String vowels = "aeiouy";
		long counter = arg.toLowerCase().chars().mapToObj(c -> (char) c).filter(c -> vowels.contains(c+"")).count();
		
		return counter;
	}
}
