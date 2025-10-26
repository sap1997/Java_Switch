//Longest Increasing Subsequence
//Input: [10, 9, 2, 5, 3, 7, 101, 18] → Output: 4 
public class LongestSubsequence {

	public static void main(String agrs[])
	{
		int ar[] = {10, 9, 2, 5, 3, 7, 101, 18};
		int maximum =0;
		int index =0;
		int temp =0;
		for(int i=0;i<ar.length;i++)
		{
			
			if(ar[index]<ar[i])
			{
				maximum++;
			}
			else
			{
				temp=maximum;
				index++;
			}
			 maximum = Math.max(temp, maximum);
		}
		System.out.println(maximum);
	}
}
