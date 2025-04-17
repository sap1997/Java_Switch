import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Array_Duplicates {

	   public static void main(String[] args) {

	        Integer[] arr = { 1, 6, 5, 2, 3, 3, 2 };
	        List<Integer> duplicates = findDuplicates(arr);

	        for (int element : duplicates) {
	            System.out.print("USing HAshmap "+element + " ");
	        }
	        System.out.println();
	        List<Integer> java8 = Arrays.stream(arr).collect(Collectors.groupingBy(n->n, Collectors.counting())).entrySet().stream()
	        						.filter(e->e.getValue()>1).map(e->e.getKey()).collect(Collectors.toList());
	        
	        	System.out.println(java8);
	   }
	        

	private static List<Integer> findDuplicates(Integer[] arr) {
		// TODO Auto-generated method stub
		List<Integer> result = new ArrayList<>();
		Map<Integer,Integer> charmap = new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			charmap.put(arr[i],charmap.getOrDefault(arr[i],0)+1);
		}
		for(Map.Entry<Integer,Integer> res : charmap.entrySet())
		{
			if(res.getValue()>1)
				result.add(res.getKey());
		}
		return result;
	}
}
