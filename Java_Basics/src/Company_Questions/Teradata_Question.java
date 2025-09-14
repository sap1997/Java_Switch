/*
 * Input: arr[] = {3, 10, 2, 1, 20}

Output: 3

Explanation: The longest increasing subsequence is 3, 10, 20
 
Input: arr[] = {3, 2}

Output:1

Explanation: The longest increasing subsequences are {3} and {2}
 
Input: arr[] = {50, 3, 10, 7, 40, 80}

Output: 4

Explanation: The longest increasing subsequence is {3, 7, 40, 80}
 
 */
package Company_Questions;

public class Teradata_Question {
	
	public static void main(String args[])
	{
		//int ar[]= {3,10,2,1,20};
		//int ar[] = {3,2};
		//int ar[] = {50, 3, 10, 7, 40, 80};
		int ar[] = {50, 3, 10, 7, 8, 40, 9, 100, 10, 11};
		int result= findlongestsubcount(ar);
		System.out.println(result);
	}

	private static int findlongestsubcount(int[] ar) {
		// TODO Auto-generated method stub
		int newar[] = new int[ar.length];
		if(ar.length==0)
			return 0;
		if(ar.length== 1 || (ar.length<=2 && ar[0]>ar[1]))
			return 1;
		
		int count=1;
		int sequencesize=1;
		int index =0;
		for(int i=1;i<ar.length;i++)
		{
			if(ar[index]<ar[i])
				sequencesize++;
			
			count=sequencesize;
			index++;
			if(count<sequencesize)
			{
				count = sequencesize;
				sequencesize=1;
			}
		}
		//System.out.println("Count "+count);
		//System.out.println("Sequence "+sequencesize);
		return count;
		
		// {3, 10, 2, 1, 20}
		
	}

}
