package Basics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Twosum {
	public static void main(String[] args) {
        int[] nums = {2,7,5,4,5,4};
        int target = 9;

        findTwoSum(nums, target);
        wordcount();

    }

	private static void wordcount() {
		String s = "I love coding";
		Map<String,Long> result = Arrays.stream(s.split("\\s")).collect(Collectors.groupingBy(n->n,Collectors.counting()));
		System.out.println(result);
		Map<Object, Long> charresult = s.toLowerCase().chars().mapToObj(c->(char)c).filter(c->c!=' ').collect(Collectors.groupingBy(n->n,Collectors.counting()));
		System.out.println(charresult);

		
	}

	private static void findTwoSum(int[] nums, int target) {
		// TODO Auto-generated method stub
		Set<Integer> result = new HashSet<>();
		for(int i =0;i<nums.length;i++)
		{
			int remain = target -nums[i];
			if(result.contains(remain))
					{
				System.out.println(remain+" "+nums[i]); 
					}
			result.add(nums[i]);
		}
	}

}
