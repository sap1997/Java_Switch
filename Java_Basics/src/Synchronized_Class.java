import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Synchronized_Class {
	
	 
	
	public static void main(String args[])
	{
		/*Thread t1 = new OddThread();
		Thread t2 = new EvenThread();*/
	//ExecutorService ex = Executors.newFixedThreadPool(1);
		Thread t1 = new OddThread();
		Thread t2 = new EvenThread();
		
		t1.start();
	
	}

	
	public static class OddThread extends Thread
	{
		public  synchronized void run()
		{
			for(int i=0;i<10;i++)
				if(i%2!=0)
					System.out.println("Odd Thread "+i);
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			notify();
		}
	}
	
	public static class EvenThread extends Thread
	{
		public  synchronized void run()
		{
			for(int i=0;i<10;i++)
				if(i%2==0)
					System.out.println("Even Thread "+i);
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			notify();
		}
	}
	
}
	

