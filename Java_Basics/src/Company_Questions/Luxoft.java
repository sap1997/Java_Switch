/*Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed./*

/*Input: nums = [1,1,1,1] n*n-1/2

Output: 6
Explanation: Each pair in the array are good.*/
package Company_Questions;

import java.io.*;
import java.util.*;

public class Luxoft {
	public static void main(String args[])
	{
		//int nums[] = {1,2,3,1,1,3};
		int nums[]= {1,1,1,1,1,1};
		int temp=0;
		int count =0;
		Map<Integer,Integer> res = new HashMap<>();
		for(int i : nums)
		{
			res.put(i, res.getOrDefault(i, 0)+1);
			
		}
	for(Map.Entry<Integer,Integer> entries :res.entrySet())
	{
		temp = entries.getValue();
	
		if(temp>1)
		{
			count+=(temp*(temp-1))/2;
		}
	}
	System.out.println(count);
	}
	

}
