package Basics;
import java.util.*;
public class arraysum {
	public static void main(String args[])
	{
		int ar[] = {2,7,3,1,5,6,6,3,1,2,6};
		int target=10;
		int flag=0;
		for(int i=0;i<ar.length;i++)
		{
			for(int j =i+1;j<ar.length;j++)
			{
				if(ar[i]+ar[j]==target)
				{
					System.out.println("pairs are" +ar[i]+","+ar[j]);
					flag =1;
				}
			}
		}
		if(flag==0)
		{
			System.out.println("No Pairs");
		}
		int lef=0;
		int rig=ar.length-1;
		while(lef<rig)
		{
			int temp=ar[lef];
			ar[lef]=ar[rig];
			ar[rig]=temp;
			lef++;
			rig--;
		}
		for(int len= 0;len<ar.length;len++)
		System.out.print(+ar[len]+" ");
		
		
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.println(ar[i]);
				}
			}
		}
	}
	
	
	

}
