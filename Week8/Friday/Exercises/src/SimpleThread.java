
public class SimpleThread extends Thread {

	@Override
	public void run() {
		System.out.println("Hello! My name is " + this.getName());
	}

}
