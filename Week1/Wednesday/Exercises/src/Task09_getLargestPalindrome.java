
public class Task09_getLargestPalindrome {
	static long getLargestPalindrome(long N){
		boolean flag = true;

		for(long i = N -1 ; i > 0; i--){
			String number = i + "";
			flag = true;
			
			for(int j = 0; j < number.length() ; j++){
				if( number.charAt(j) != number.charAt(number.length() -1 -j)){
					flag = false;
					break;
				}
			}
			
			if(flag == true){
				return i;
			}
		}
		
		return -1;
	}
}
