/*input - [3,1,Smita,Sneha,5,Shobha,8]
Output - 1,3,5,8,Shobha,Smita,Sneha*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SPlitStrings {
	
	public static void main(String args[])
	{
		Object input[] = {3,1,"Smita","Sneha",5,"Shobha",8};
		List<Object> numbers = new ArrayList();
		TreeSet<Object> Strings = new TreeSet();
		
		for(Object o : input)
		{
			if(o instanceof Integer)  			{
				
				numbers.add(o);
					
			}
			else
				Strings.add(o);
		}
		
		List<Object> sortednumber = numbers.stream().sorted().collect(Collectors.toList());
	
		Stream<Object> sortednumberinstream = sortednumber.stream();
		Stream<Object> Stringinstream = Strings.stream();
		List<Object> finalresult = Stream.concat(sortednumberinstream, Stringinstream).collect(Collectors.toList());
	 
	System.out.println(finalresult);
		
		
	}

}
