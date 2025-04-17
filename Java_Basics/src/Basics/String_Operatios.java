package Basics;
import java.util.*;
public class String_Operatios {
	public static void main(String args[])
	{
		String test=" Saptarshi";
		String output ="";
		for(int i =test.length()-1;i>=1;i--)
		{
			output+=test.charAt(i);
		}
		System.out.println(output);
		
	}

}
