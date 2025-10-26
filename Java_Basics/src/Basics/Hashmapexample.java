package Basics;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
public class Hashmapexample {
	
	public static void main(String args[])
	{
		Map<String,Integer> map = new HashMap<>();
		//m.put("a",Arrays.asList("test","best","test"));
		//m.put("b",Arrays.asList("Hi","Hello","Hi"));
		
		/*Optional<Entry<String, Long>> result= m.entrySet().stream().flatMap(e->e.getValue().stream()).collect(Collectors.groupingBy((n->n),Collectors.counting())).entrySet().stream()
				 .filter(e->e.getValue()==1).collect(Collectors.toMap(e, null));
		
		
		if(result.isPresent())
		{
			System.out.println(result.get());
		}*/
		
		map.put("apple", 3);
		map.put("banana", 1);
		map.put("cherry", 2);
		map.put("date", 2);
		map.put("apricot", 1);
		
		Map<String, Integer> result = map.entrySet()
		        .stream()
		        .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
		        .collect(Collectors.toMap(
		                Map.Entry::getKey,
		                Map.Entry::getValue,
		                  // merge function
		                LinkedHashMap::new // preserve order
		        ));

		
		System.out.println(result);
		
		
		System.out.println(result);

		
		
	}

}
