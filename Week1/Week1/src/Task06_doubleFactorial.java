
public class Task06_doubleFactorial {
	static long doubleFac(int n){
		long factorial = n;
		
		for(int j = 0; j < 2 ; j++){
			factorial = factorial(factorial);
		}
		
		return factorial;
	}
	
	static  long factorial(long n){
		long factorial = 1;
		
		for(int i = 1 ; i <= n ; i++){
			factorial*= i;
		}
		
		return factorial;
	}
}
