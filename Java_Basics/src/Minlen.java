
public class Minlen {
	public static void main(String args[])
	{
		 int nums[] = {2,3,1,5,6};
		 int target = 10;
		 int result = findmin(target,nums);
		 System.out.println(result);
	}

	private static int findmin(int target, int[] nums) {
		int minLen = Integer.MAX_VALUE;
		int start=0,sum=0;
		for(int i =0;i<nums.length;i++)
		{
			sum+=nums[i];
			while(sum>=target)
			{
				minLen = Math.min(minLen, i-start+1);
				sum-=nums[start++];
			}
		}
		return (minLen!=Integer.MAX_VALUE)?minLen:0;
	}

}
