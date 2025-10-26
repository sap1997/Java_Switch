//second max number from array
//first repeating
package Company_Questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.Map;
public class NTT_September {
	
	public static void main(String args[])
	{
		List<Integer> li = Arrays.asList(10,20,30,40,50,50);
		int ar[] = {10,20,10,30,40,50,50};
		int max =0;
		int second=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>max)
			{
				max = ar[i];
				second = max;
			}
			else if(ar[i]!=max && ar[i]<max)
			{
				second =ar [i];
			}
		}
		
		System.out.println("Second higest is"+second);

	Optional<Integer>second = li.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst();
		
		System.out.println("Second higest is"+second.get());
		
		String s = "i love my love india";
		
		Optional<Character> firstrepeating = s.chars().mapToObj(c->(char)c).filter(c->c!=' ')
											.collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()))
											.entrySet().stream().filter(c->c.getValue()>1).map(c->c.getKey()).findFirst();
		
		System.out.println("First repeating charecter is "+firstrepeating.get());
										
	}

	/*SELECT DISTINCT(*) FROM EMPLOYEE ORDER BY SALARY DESC LIMIT 1 OFFSET 1;
	//1000,1000,900,800;
	SELECT * FROM EMPLOYEE WHERE SALARY(SELECT DISTINCT(SALARY) FROM EMPLOYEE ORDER BY SALARY DESC LIMIT 1 OFFSET 1);*/
	
	
}
