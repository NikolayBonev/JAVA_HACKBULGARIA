
public class ThreadIncrement implements Runnable {
	CounterObject obj = null;
	
	public ThreadIncrement(CounterObject obj) {
		if(obj == null || !(obj instanceof CounterObject)){
			throw new IllegalArgumentException();
		}
		
		this.obj = obj;
	}

	@Override
	public void run() {
		for(int i = 0 ; i < 1000000; i++){
			obj.increment();
		}
	}

}