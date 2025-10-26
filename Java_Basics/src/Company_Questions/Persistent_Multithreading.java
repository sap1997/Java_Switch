package Company_Questions;

public class Persistent_Multithreading {
	
	
	//int counter =1;
	
	public static class OddThread extends Thread
	{
		public synchronized void run()
		{
			for(int i=1;i<10;i++)
			{
				
					System.out.println("Thread1 is printing "+i);
				
			

		}
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			notifyAll();

	}

	}
	
	public static class EvenThread extends Thread
	{
		public synchronized void run()
		{
			for(int i=1;i<=10;i++)
			{
				
					System.out.println("Thread2 is printing "+i);
				
		

		}
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			notifyAll();
	}
		
	}
	
	public static void main(String args[])
	{
		OddThread o = new OddThread();
		EvenThread e = new EvenThread();
		o.start();
		e.start();
	}

}
