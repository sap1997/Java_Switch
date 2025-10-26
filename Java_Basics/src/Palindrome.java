import java.util.*;
public class Palindrome {

	public static void main(String args[])
	{
		String s = "madam";
		String ns = s.chars().mapToObj(c->String.valueOf((char)c)).reduce("",(a,b)->b+a);
		
		System.out.println(ns);
	}
}
