package Basics;
import java.util.*;
public class arr_test {
	public static void main(String args[])
	{
		int ar[]= {1,2,3,4,5,6,6};
		Arrays.sort(ar);
        int largest =ar[0];
        int secondLargest = Integer.MIN_VALUE;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>largest)
			{
				secondLargest=largest;
				largest=ar[i];
			}
			else if(secondLargest>ar[i] && ar[i]!=largest)
			{
				secondLargest=ar[i];
			}
		}
		System.out.println(secondLargest);
		
		
	}

}
