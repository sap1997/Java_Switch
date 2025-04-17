package Basics;

public class equil {
	public static void main(String args[])
	{
		int[] ar = {1, 3, 5, 2, 2};
		int sum=0;
		int result=0;
		for(int num:ar)
		{
			sum+=num;
		}
		int leftsum=0;
		for(int i=0;i<ar.length;i++)
		{
			sum-=ar[i];
			if(leftsum==sum)
			{
				result =i;
				break;
			}
			else
			{
				leftsum+=ar[i];
			}
		}
		System.out.println(result);
	}

}
