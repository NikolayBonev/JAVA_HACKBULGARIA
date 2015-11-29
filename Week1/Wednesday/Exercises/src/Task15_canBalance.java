
public class Task15_canBalance {
	static boolean canBalance(int[] numbers){
		long leftSum = 0;
		long rightSum = 0;
		
		for(int i = 0 ; i < numbers.length ; i++){
			leftSum += numbers[i];
			
			if(i > 0){
				for(int j = 0; j < i; j++){
					leftSum += numbers[j];
				}
			}
			
			if(i < numbers.length -1){				
				for(int j = i+1; j < numbers.length; j++ ){
					rightSum += numbers[j];
				}
			}
			
			if(leftSum == rightSum){
				return true;
			}
			
			leftSum = 0;
			rightSum = 0;
		}
		
		return false;
	}
}
