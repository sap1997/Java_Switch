//
package Company_Questions;

import java.util.*;

public class Neosoft {
	public static void main(String args[])
	{
		List<Integer> numbers = Arrays.asList(10,20,30,40,50,50,40);
		
		Map<Integer,Integer> countofnumbers = new HashMap<>();
		for(int i : numbers)
		{
			countofnumbers.put(i, countofnumbers.getOrDefault(i, 0)+1);
		}
		
		System.out.println(countofnumbers);
		
		for(Map.Entry<Integer,Integer> Kv: countofnumbers.entrySet())
		{
			if(Kv.getValue()>1)
				System.out.println(Kv.getKey());
		}
		
	
	}

}
