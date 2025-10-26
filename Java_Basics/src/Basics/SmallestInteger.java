package Basics;

import java.io.*;
public class SmallestInteger {
	public static void main(String args[])
	{
		
		int ar[] = {2,3,5,4,-1};
		int initial = 1;
		int smallest = Integer.MAX_VALUE;

		for(int i: ar)
		{
			if(i>0 && i<smallest)
			{
				smallest = i;
			}
			
		}
		System.out.println(smallest);
	}

}
