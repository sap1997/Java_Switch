package Basics;
import java.util.*;
public class ArrayRo {
	public static void main(String args[])
	{
		int ar[]= {1,2,3,4,5};
		int n=2;
		rotate(ar,n);
		System.out.println(Arrays.toString(ar));
	}
	static void rotate(int ar[],int n)
	{
		/*getrotation(ar,0,n-1);
		getrotation(ar,n,ar.length-1);
		getrotation(ar,0,ar.length-1);*/
		getrotation(ar,0,ar.length-1);
		getrotation(ar,0,n-1);
		getrotation(ar,n,ar.length-1);
		
	}
	static void getrotation(int ar[],int start,int end)
	{
		while(start<end)
		{
			int temp = ar[start];
			ar[start] = ar[end];
			ar[end] = temp;
			start++;
			end--;
		}
	}

}
