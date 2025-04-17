package Basics;

import java.util.Arrays;

public class Anagram {
	public static void main(String args[])
	{
		String a ="ACAT";
		String b= "ACTA";
		
		if(a.length()!=b.length())
		{
			System.out.println("Not Anagram");
		}
		char[] ach = a.toCharArray();
		char[] bch = b.toCharArray();
		Arrays.sort(ach);
		Arrays.sort(bch);
		if(Arrays.equals(ach, bch))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}
	}
	

}
