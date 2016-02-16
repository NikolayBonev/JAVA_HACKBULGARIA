
public class SumThread implements Runnable {

	int number1 = 0;
	int number2 = 0;
	
	public SumThread(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}

	@Override
	public void run() {
		System.out.println(String.format("The sum of %d and %d is %d", this.number1, this.number2, this.number1+this.number2));
	}

}