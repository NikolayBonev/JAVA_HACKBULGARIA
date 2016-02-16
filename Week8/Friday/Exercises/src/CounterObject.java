import java.util.concurrent.atomic.AtomicInteger;

public class CounterObject {
	private AtomicInteger counter = new AtomicInteger(0);
	
	public void increment(){
		this.counter.incrementAndGet();
	}
	
	public void decrement(){
		this.counter.decrementAndGet();
	}
	
	public int getValue(){
		return this.counter.get();
	}
}
