
public class Task13_maximalScalarSum {
	static long maximalScalarSum(int[] a, int[]b){
		long result = 0;
		
		for(int i = 0 ; i < a.length; i++){
			getPermutation(a);
			
			for(int j = 0; j < b.length ; j++){
				getPermutation(b);
				
				long swapResult = 0;
				
				for(int k = 0 ; k < a.length ; k++){
					swapResult += a[k]*b[k];
				}
				
				if(swapResult > result){
					result = swapResult;
				}
				
				swapResult = 0;
			}
		}
		
		return result;
			
	}
	
	static void getPermutation(int[] array){
		int iSwap = array[0];
				
		for(int j = 0, k = 1 ; j < array.length && k < array.length ; j++, k++){
			array[j] = array[k];
		}
		
		array[array.length -1] = iSwap;
	}
}
