package Company_Questions;

public class Intellswift {
	public static void main(String args[])
	{
		String s="  today   is  the  interview  ";
		String newstring="";
		String[] words = s.split(" ");
		
		for(String eachword:words)
		{
			if(eachword!=" ")
				newstring+=eachword;
			
		}
		
	System.out.println(newstring);

	}

}
