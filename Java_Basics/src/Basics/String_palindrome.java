package Basics;
import java.io.*;
public class String_palindrome {
	public static void main(String args[])
	{
		String s ="radar";
		int length =s.length();
		String dup="";
		/*for(int i=length;i>=1;i--)
			{
				dup+=s.charAt(i);
			}*/
		
		//dup+=s.charAt(0);
		System.out.println(dup);
		
		StringBuffer sb = new StringBuffer("radar");
		sb.reverse();
		System.out.println(sb);
		
		if(s.contentEquals(sb))
		{
			System.out.println("This is Palindrome");
		}
		else
		{
			System.out.println("This is not Palindrome");
		}
		
		
		
	}

}
