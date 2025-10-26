package Basics;
import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Palindrome {
	public static void main(String args[])throws IOException
	{
		int number;
		int reverse=0;
		int sum=0;
		int digit;
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		int temp = number;
		/*while(number!=0)
		{
			digit=number%10;
			reverse = (reverse*10)+digit;
			number/=10;
		}*/
		String val = String.valueOf(number);
		StringBuilder sb = new StringBuilder(val);
		sb.reverse();
		String temprev =sb.toString();
		temp = Integer.parseInt(temprev);
		System.out.println(temp);
		if(temp==number)
		{
			System.out.println(temp+ " is a palindrome number");
		}
		else
		{
			System.out.println("Its not palindrome");
		}
		String s = "arora";
		String ns="";
		for(int i=s.length()-1;i>=0;i--)
		{
			ns+= s.charAt(i);
		}
		System.out.println(ns);
		
				
	}

}
