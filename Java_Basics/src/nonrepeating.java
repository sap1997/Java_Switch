//Given a String, find the first non-repeated character in it using Stream functions?

import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class nonrepeating {

	public static void main(String args[])
	{
		String s ="swiss";
		//Map<Character,Long> count = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy((n->n),Collectors.counting()));
		//Optional<Character> result = count.entrySet().stream().filter(e->e.getValue()==1).map(e->e.getKey()).findFirst();
		
		Optional<Character> result = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy((n->n),Collectors.counting())).entrySet()
				.stream().filter(e->e.getValue()==1).map(e->e.getKey()).findFirst();
		
		if(result.isPresent())
		{
			System.out.println(result.get());
		}
		
		
									
		
	}
}
