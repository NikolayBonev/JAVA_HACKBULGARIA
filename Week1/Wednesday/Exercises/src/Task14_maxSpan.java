
public class Task14_maxSpan {
	static int maxSpan(int[] numbers){
		if(numbers.length == 0){
			return 0;
		}else if(numbers[0] == numbers[numbers.length-1]){
			return numbers.length;
		}
		
		int maxLen = 0;
		
		for(int i = 0; i < numbers.length ; i++){
			for(int j = numbers.length -1 ; j>=0 && j>=i; j--){
				if(numbers[i] == numbers[j] && (j - i + 1) > maxLen){
					maxLen = (j - i + 1);
				}
			}
		}
		
		return maxLen;
	}
}
