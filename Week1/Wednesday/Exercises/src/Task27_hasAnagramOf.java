
public class Task27_hasAnagramOf {
	static boolean hasAnagramOf(String A,String B){
		
		A = A.replaceAll("[^a-zA-Z]", "");
		B = B.replaceAll("[^a-zA-Z]", "");
		
		int endIndex = A.length();
		for(int i = 0; i < B.length() && endIndex < B.length(); i++){
			if(Task26_anagram.anagram(A, B.substring(i, endIndex))){
				return true;
			}
			
			endIndex++;
		}
		
		return false;
	}
}
