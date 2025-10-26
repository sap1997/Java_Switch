
public class ThreadOperations {
	private int start =1;
	private final int max;
	private final int threads;
	public ThreadOperations(int max, int threads) {
		super();
		this.max = max;
		this.threads = threads;
	}
	public  void printnumbers(int tid)
	{
		while(true)
		{
			synchronized(this)
			{
				while(start<=max && (start-1)%threads !=tid)
				{
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(start>max)
				{
					notifyAll();
					break;
				}
				System.out.println("THREAD-" + (tid + 1) + " : " + start);
				start++;

	            notifyAll(); // notify other threads
			}
			
		}
		
	}
	
	public static class MainThread
	{
		public static void main(String args[])
		{
			ThreadOperations ob = new ThreadOperations(10,3);
			Thread t1 = new Thread(()->ob.printnumbers(0));
			Thread t2 = new Thread(()->ob.printnumbers(1));
			Thread t3 = new Thread(()->ob.printnumbers(2));
				t1.start();
				t2.start();
				t3.start();

		}
	
}


}
