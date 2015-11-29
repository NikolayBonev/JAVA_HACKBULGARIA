import java.util.Scanner;

public class Task25_sumOfNumbers {
	static int sumOfNumbers(String input){	
		input = input.replaceAll("[^0-9]+", " ");
		
		Scanner in = new Scanner(input);
		
		int result = 0;
		
		while(in.hasNext()){
			if(in.hasNextInt()){
				result +=in.nextInt();
			}
		}
		
		in.close();
		return result;
	}
}
