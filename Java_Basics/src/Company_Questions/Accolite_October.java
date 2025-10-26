/*Shift all zeros at the end.
 
int [] arr = {0, 4, 3, 5, 0, 2}
output {4, 3, 5, 2, 0, 0}
 
Problem 2:
 
Given an array of integers nums and an integer target, return the indices of the two numbers such that they add up to the target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
 
Return the answer as an array of the two indices.
 
Input: nums = [2, 7, 11, 15], target = 9  
Output: [0, 1]*/
package Company_Questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Accolite_October {
	
	public static void main(String args[])
	{
		int[] ar = {0,4,3,5,0,2};
		List<Integer> result = Arrays.stream(ar).boxed().filter(n->n!=0).collect(Collectors.toList());
		for(int i=result.size();i<ar.length;i++)
		{
			result.add(0);
		}
		System.out.println(result);
		
		int[] nums = {2,7,11,15};
		int target = 9;
		findsum(nums,target);
	}

	private static void findsum(int[] nums, int target) {
		Set<Integer> store = new HashSet<>();		
		Set<Integer> result = new HashSet<>();
		Set<Integer> index = new HashSet<>();

		for(int number : nums)
		{
			int remaining = target -number;
			if(store.contains(remaining))
			{
				result.add(remaining);
				result.add(number);
			}
			store.add(number);
		}
		for(int i=0;i<nums.length;i++)
		{
			if(result.contains(nums[i]))
				index.add(i);
		}
		//System.out.println(result);
		System.out.println(index);
		
	}

}

//Employee:- fname,lname,id...fname duplicates 

SELECT ID,FNAME,LNAME FROM EMPLOYEE HAVING COUNT(FNAME)>1 GROUP BY FNAME;