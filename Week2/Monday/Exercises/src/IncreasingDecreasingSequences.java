public class IncreasingDecreasingSequences {
	static boolean IsIncreasing(int[] sequence){
		for(int i = 0 ; i < sequence.length -1 ; i++){
			if(sequence[i] > sequence[i+1]){
				return false;
			}
		}
		
		return true;
	}
	
	static boolean IsDecreasing(int[] sequence){
		for(int i = 0 ; i < sequence.length -1 ; i++){
			if(sequence[i] < sequence[i+1]){
				return false;
			}
		}
		
		return true;
	}
}