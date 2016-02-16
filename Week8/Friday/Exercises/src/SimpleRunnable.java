
public class SimpleRunnable implements Runnable {

	private String message = null;
	
	public SimpleRunnable() {
		this.message = "Hello! My name is " + this.toString();
	}

	public SimpleRunnable(String message) {
		this.message = message;
	}

	@Override
	public void run() {
		System.out.println(this.message);

	}

}
