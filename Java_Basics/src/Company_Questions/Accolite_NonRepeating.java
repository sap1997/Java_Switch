//java
package Company_Questions;

import java.util.*;
import java.util.stream.Collectors;
public class Accolite_NonRepeating {
	public static void main(String args[])
	{
		String s = "java";
		Optional<Character> secondnonrepeating = s.chars().mapToObj(c->(char)c)
												 .collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()))
												 .entrySet()
												 .stream().filter(e->e.getValue()==1)
												 .map(e->e.getKey())
												 .skip(1)
												 .findFirst();
		
		if(secondnonrepeating.isPresent())
		{
			System.out.println(secondnonrepeating.get());
		}
						
	}

}
