package Design_Patterns;

public class Singleton {
	private  static Singleton single_inst;
	private Singleton()
	{
		
	}
	public static Singleton setinst()
	{
		if(single_inst==null)
		{
			single_inst = new Singleton();
		}
		return single_inst;
	}
	 

}
