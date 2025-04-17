package Basics;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
public class Hashmapexample {
	
	public static void main(String args[])
	{
		Map<String,List<String>> m = new HashMap<>();
		m.put("a",Arrays.asList("test","best","test"));
		m.put("b",Arrays.asList("Hi","Hello","Hi"));
		
		Optional<Entry<String, Long>> result= m.entrySet().stream().flatMap(e->e.getValue().stream()).collect(Collectors.groupingBy((n->n),Collectors.counting())).entrySet().stream()
				 .filter(e->e.getValue()==1).collect(Collectors.toMap(e, null));
		
		
		if(result.isPresent())
		{
			System.out.println(result.get());
		}

		
		
	}

}
