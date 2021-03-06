
public class Task29_hack_Numbers {
	static boolean isHack(long n){
		
		String numInBinary = Long.toBinaryString(n);
		boolean palindrome = Task19_20_isPalindrome.isPalindrome(numInBinary);
		boolean oddCount = (countOfOnes(numInBinary)%2 ==1);
		
		return palindrome && oddCount;
	}
	
	static long countOfOnes(String binaryNumber){
		
		long count = 0;
		
		for(int i = 0 ; i < binaryNumber.length(); i++){
			if(binaryNumber.charAt(i) == '1'){
				count++;
			}
		}
		
		return count;
	}
	
	static long nextHack(long n){
		
		boolean flag = true;
		
		while(flag){
			if(isHack(++n)){
				break;
			}
		}
		
		return n;
	}
}
