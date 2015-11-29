
public class Task11_pow {
	static long pow(int a, int b){
		long powNum = a;
		
		for(int i = 1 ; i < b ; i++){
			powNum *= a; 
		}
		
		return powNum;
	}	
}