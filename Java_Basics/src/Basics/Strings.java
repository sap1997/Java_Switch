package Basics;
import java.io.*;
import java.util.*;
public class Strings {
	public static void main(String args[])throws IOException
	{
		String a ="tac is a good bye";
		String b ="Cat";
		if(isanagram(a,b)==1)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Non Anagram");
		}
		a = a.replaceAll("t", "m");
		System.out.println(a);
		
	}
	public static  int isanagram(String a,String b)
	{
		a=a.toLowerCase();
		b=b.toLowerCase();
		if(a.length()!=b.length())
			return -1;
		int ret =0;
		char[] s1= a.toCharArray();
		char[] s2= b.toCharArray();
		Arrays.sort(s1);
		Arrays.sort(s2);
		if(Arrays.equals(s1, s2))
		{
			ret=1;
		}
		return ret;

	}

}
