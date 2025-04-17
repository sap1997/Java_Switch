package Basics;
import java.io.*;
import java.util.*;
public class Fibonacci_Series {
	public static void main(String args[])throws IOException
	{
	    Scanner sc = new Scanner(System.in);
	    int n;
	    n = sc.nextInt();
		int first =0;
		int second = 1;
		int third;
		System.out.print(first+" "+second);
		for(int i =2;i<n;i++)
		{
			third = first+second;
			first =second;
			second=third;
			
			System.out.print(" "+third);
		}
	}

}
