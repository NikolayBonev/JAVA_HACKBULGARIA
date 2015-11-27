import java.math.BigInteger;

public class Fibonacci_number {
	static BigInteger fibNumber(int n){
		
		if(n == 1){
			return new BigInteger("1");
		}else if(n == 2){
			return new BigInteger("11");
		}else if(n == 0){
			return new BigInteger("0");
		}
		
		StringBuilder fib = new StringBuilder("11");
		
		int fib1 = 1;
		int fib2 = 1;
		
		for(int i = 3; i <= n ; i++){
			fib.append((fib1+fib2));
			
			int swap = fib1;
			
			fib1 = fib2;
			fib2 = fib1 + swap;
			
			swap = 0;
			
		}
		
		return new BigInteger(fib.toString());
	}
}
