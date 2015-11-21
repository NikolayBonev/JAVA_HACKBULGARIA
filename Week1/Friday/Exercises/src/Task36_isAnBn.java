
public class Task36_isAnBn {
	
	static boolean is_an_bn(String word){
		
		if(word.length() == 0){
			return true;
		}else if(word.length() %2 != 0){
			return false;
		}
		
		for(int i = 0 ; i < word.length()/2 ; i++){
			if((word.charAt(i) != 'a') || (word.charAt(i+(word.length()/2)) != 'b')){
				return false;
			}
		}
		
		return true;
	}
}
