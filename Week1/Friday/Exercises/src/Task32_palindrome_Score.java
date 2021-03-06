
public class Task32_palindrome_Score {
	
	static int pScore(int n){
		
		if(n < 0){
			n = n*(-1);
		}
		if(Task19_20_isPalindrome.isPalindrome(n)){
			return 1;
		}
		
		return (1 + pScore((n + reversedNumber(n))));
	}
	
	static int reversedNumber(int number){
		int reversed = 0;
		int swap = 0;
		swap = number;
		
		while(swap > 0){
			reversed = reversed*10 + swap%10;
			swap = swap/10;
		}
		
		return reversed;
	}
}
