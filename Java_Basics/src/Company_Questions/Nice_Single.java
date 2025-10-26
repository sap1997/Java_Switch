//11000111001111100011
package Company_Questions;

import java.util.ArrayList;
import java.util.List;

public class Nice_Single {

	public static void main(String args[])
	{
		String s = "11000111001111100000011";
		int count =0;
		int result=0;
		Integer finalindex=0;
		List<Integer> index = new ArrayList<>();
	for(int i=0;i<s.length()-1;i++)	
	{

		if(s.charAt(i)==s.charAt(i+1))
		{

			count++;
			
			
		}
	
		else
		{
			

			if(count>result) 
			{
				result=count;
			}
			count=0;
		}
		
		}
		System.out.println("Largest count is "+(result+1)+" & index is "+index);
		
	}
}
