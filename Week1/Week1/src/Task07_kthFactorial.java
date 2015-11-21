
public class Task07_kthFactorial {
	static long kthFac(int k, int n){
		long factorial = n;
		
		for(int j = 0 ; j < k ; j++){
			factorial = Task06_doubleFactorial.factorial(factorial);
		}
		
		return factorial;
	}
}
