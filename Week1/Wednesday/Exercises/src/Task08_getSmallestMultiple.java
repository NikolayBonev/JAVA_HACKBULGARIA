import java.util.ArrayList;

public class Task08_getSmallestMultiple {
	static long getSmallestMultiple(int upperBound){
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
		
		for(int i = 2 ; i<= upperBound; i++){
			if(Task02_isPrime.isPrime(i)){
				primeNumbers.add(i);
			}
		}
		
		int[] arrayNumbers = new int[upperBound-1];
		
		for(int i = 2; i <= upperBound ; i++){
			arrayNumbers[i-2] = i;
		}
		
		long multiple = 1;
		boolean flag = false, flagMultiple = false;
		
		for(int i = 0; i < primeNumbers.size() ;i++){
			for(int j = 0 ; j < upperBound -1; j++){
				if(arrayNumbers[j]%primeNumbers.get(i) == 0){
					flagMultiple = true;
					arrayNumbers[j] /= primeNumbers.get(i);
					
					if(!Task01_isOdd.isOdd(arrayNumbers[j])){
						flag = true;
					}
				}
			}
			
			if(flagMultiple){
				multiple *= primeNumbers.get(i);	
			}
			
			if(flag){
				i--;
				flag = false;
			}
		}
		
		return multiple;
	}
}
