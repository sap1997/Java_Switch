import java.util.List;

public class Singleton implements CoordinateDetails
{
	private static Singleton singleton;
	int result = 0;
	 Singleton()
	 {
		 
	 }
	 
	 public static Singleton getinstance()
	 {
		 if(singleton==null)
		 {
			 singleton = new Singleton();
		 }
		 return singleton;
	 }

	@Override
	public void findnearest(List<Integer> values) {
		 for (int i : values)
		 {
			 //Logic for implementing it
		 }
		
	}
}
				
					


