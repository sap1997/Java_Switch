package Company_Questions;
import java.util.*;
public class Epam_Question {
	
	public void main(String args[])
	{
		int a[] = {1,2,3,4};
		int b[] = {6,7,8};
		int[] finalarray = new int[a.length+b.length];
		
		int left=0,right = 0,index=0;
		while(left<right)
		{
			if(a[left]<b[right])
			{
				finalarray[index++] = a[left++];
			}
			else
			{
				finalarray[index++] = b[right++];
			}
		}
		
	for(int i=0;i<finalarray.length;i++)
	{
		System.out.println(finalarray[i]);
	}
	
	}

}