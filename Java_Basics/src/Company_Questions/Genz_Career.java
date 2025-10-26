//int ar[] = {1,2,3,4,5,6}
package Company_Questions;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.*;
public class Genz_Career {
	
	public static void main(String args[])
	{
		List<Integer> ar = Arrays.asList(1,2,3,1,2);
		Optional<Integer> firstNonRepeating = ar.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())) //1-2 2-2 3-1 4-1
												.entrySet().stream().filter(e->e.getValue()==1).map(e->e.getKey()).findFirst();
		if(firstNonRepeating.isPresent())
		{
			System.out.println(firstNonRepeating.get());
		}
		
	Integer sumofnumbers = ar.stream().reduce(0,((x1,x2)->x1+x2));
	System.out.println(sumofnumbers);
	}

}
