//List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 11, 12, 13, 14, 15);
package Company_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Capgemini_August {
	public static void main(String args[])
	{
		List<Integer> numbers = Arrays.asList(2, 5, 6, 8, 10, 17, 12, 13, 14, 15);
		Map<Boolean,List<Integer>> result = numbers.stream().collect(Collectors.partitioningBy(n->n%2==0));
		System.out.println(result);
		
		
	}

}
