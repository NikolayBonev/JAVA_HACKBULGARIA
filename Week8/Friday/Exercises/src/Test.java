
public class Test {

	public static void main(String[] args) {
		
/*
 *		 Task 1 : Make a class that extends Thread
 */
		
//		SimpleThread thread1 = new SimpleThread();
//		thread1.start();

/*
 * 		Task 2-1 : Make a class that implements Runnable
 */
	
//		SimpleRunnable thread2 = new SimpleRunnable();
//		thread2.run();

/*
 * 		Task 2-2 : Modify SimpleThread or SimpleRunnable to print message from main		
 */
		
//		SimpleRunnable thread3 = new SimpleRunnable("Hello! I'm thread 3.");
//		thread3.run();
		
/*
 * 		Task 2-3 : Use .join() before printing the message from main
 */
		
//		SimpleThread thread4 = new SimpleThread();
//		Thread thread5 = new Thread(new SimpleRunnable("Hello! I'm thread 5!"));
//		
//		try {		
//			thread4.start();
//			thread4.join();
//			
//			thread5.start();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
/*
 * 		Task 3 : Make Thread that sums two integers provided from the user
 */
		
//		SumThread thread6 = new SumThread(5, 6);
//		thread6.run();
		
/*
 * 		Task 4 : Lost update example. Make two threads that increment the same 
 * 				 counter 1 000 000 times. What is the result? Why this problem 
 * 				 exists? How can we resolve it?
 */
//		CounterObject obj = new CounterObject();
//		
//		ThreadIncrement thread7 = new ThreadIncrement(obj);
//		thread7.run();
//		ThreadIncrement thread8 = new ThreadIncrement(obj);
//		thread8.run();
//		
//		System.out.println(obj.getValue());
		
/*
 * 		Try to reproduce Visibility problem.
 */
		
		VisibilityThread thread9 = new VisibilityThread();
		thread9.run();
		thread9.setProgress(true);
		
	}

}
