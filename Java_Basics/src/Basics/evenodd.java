package Basics;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class evenodd {
	public static void main(String args[])
	{
		List<Integer> nums = Arrays.asList(2,5,6,7,8,9,10);
		List<Integer> even = nums.stream().filter(x->x%2==0).collect(Collectors.toList());
		List<Integer> odd = nums.stream().filter(x->x%2!=0).collect(Collectors.toList());
		List<Integer> res = Stream.concat(even.stream(), odd.stream()).collect(Collectors.toList());
		System.out.println(res);

		
	}
}
