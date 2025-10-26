
public class ThreadGame {

	public static void main(String args[])
	{
		ThreadGame obj = new ThreadGame();
		Thread t1 = new oddthread(obj);
		Thread t2 = new eventhread(obj);
		t1.start();
		t2.start();
	}
	static class oddthread extends Thread
	{
		ThreadGame obj;
		oddthread(ThreadGame obj)
		{
			this.obj=obj;
		}
		public void run()
		{
			obj.printodd();
		}
	}
	
	static class eventhread extends Thread
	{
		ThreadGame obj;
		eventhread(ThreadGame obj)
		{
			this.obj=obj;
		}
		public void run()
		{
			obj.printeven();
		}
	}

	public synchronized void printodd() {
		// TODO Auto-generated method stub
		for(int i =0;i<10;i++)
		{
			if(i%2!=0)
			{
				System.out.println("This is odd "+i);
				notify();
			}
			else
			{
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			}
		}
	
	public synchronized void printeven() {
		// TODO Auto-generated method stub
		for(int i =0;i<10;i++)
		{
			if(i%2==0)
			{
				System.out.println("This is even "+i);
				notify();
			}
			else
			{
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			}
		}
		
		
	}

