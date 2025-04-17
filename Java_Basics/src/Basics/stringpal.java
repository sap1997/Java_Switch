package Basics;
import java.util.*;

import javax.sound.sampled.ReverbType;
public class stringpal {
	
	public static void main(String args[])
	{
		String s = "arora";
		int length = s.length();
		String rev ="";
		for(int i =length-1;i>=0;i--)
		{
			rev+=s.charAt(i);
		}
		System.out.println(rev);
		if(s.equals(rev))
		{
			System.out.println("Its Palindrome");
		}
		else
		{
			System.out.println("Its not Palindrome");
		}
		char[] chars = s.toCharArray();
		List<String> list = new ArrayList<String>();
		
		StringBuffer sb = new StringBuffer("arora");
		StringBuffer result = sb.reverse();
		System.out.println(result);
		
		
	
	}
	 
}

list =1,2,3,4,5

