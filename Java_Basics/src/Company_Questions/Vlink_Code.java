/*{"listen", "silent", "enlist", "hello", "tinsel", "inlets", "world"}*/
package Company_Questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Vlink_Code {
	
	public static void main(String args[])
	{
		List<Integer> input = Arrays.asList(1,2,2,3,3,6,7,2);
		List<Integer> res = input.stream().collect(Collectors.groupingBy(n->n,Collectors.counting())).entrySet()
									.stream().filter(e->e.getValue()>1).map(e->e.getKey()).collect(Collectors.toList());
		
		System.out.println(res);
	}
}
