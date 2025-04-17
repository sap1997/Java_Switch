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
		while(number!=0)
		{
			digit=number%10;
			reverse = (reverse*10)+digit;
			number/=10;
		}
		if(temp==reverse)
		{
			System.out.println(temp+ " is a palindrome number");
		}
		else
		{
			System.out.println("Its not palindrome");
		}
				
	}

}
