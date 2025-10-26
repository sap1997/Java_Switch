package Company_Questions;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
/*
 * "A", 1)
("B", 2)
(null, 3)
("C", 4)
(null, 5)
 */
public class October {
	
	public static void main(String args[])
	{
		Map<String,Integer> input = new HashMap<>();
		input.put("A",1);
		input.put("B", 2);
		input.put(null, 3);
		input.put("C", 4);
		input.put(null, 5);
		
		System.out.println(input.size());
		
		for(Map.Entry<String,Integer>kv : input.entrySet())
		{
			System.out.println(kv.getKey()+"->"+kv.getValue());
		}
		
		input.entrySet().stream().forEach(System.out::println(c->c.getKey()+"->"+c.getValue()));
		

	}

}
