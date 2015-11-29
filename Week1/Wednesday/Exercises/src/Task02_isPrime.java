
public class Task02_isPrime {
	static boolean isPrime(int N){
		int counter = 0;
		
		for(int i = 1 ; i <= N ; i++){
			if(N%i == 0){
				counter++;
				
				if(counter > 2){
					return false;
				}
			}
		}
		
		return true;
	}
}
