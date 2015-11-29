
public class Task23_countOcurrences {
	static int countOcurrences(String needle, String haystack){
		int counter = 0;
		int index = -1;
		
		while(true){
			index = haystack.indexOf(needle.charAt(0), index + 1);
			
			if(haystack.length() - index >= needle.length()  && index > -1){
				if(haystack.substring(index, index+needle.length()).equals(needle)){
					counter++;
				}
			}else{
				break;
			}
		}
		
		return counter;
	}
}
