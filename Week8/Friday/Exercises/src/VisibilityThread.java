
public class VisibilityThread implements Runnable{
	private boolean isDone = false;
	
	public void setProgress(boolean progress){
		this.isDone = progress;
	}
	
	@Override
	public void run() {
		int i = 1;
		
		while(!isDone){
			i++;
		}
		
		System.out.println("Value is " + i);
	}
	
}
