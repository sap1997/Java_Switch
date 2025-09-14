package Company_Questions;
import java.io.*;
import java.util.*;
public class Persistent_String {
public static void main(String args[])
{
	String strnew2 = "My name is abcd";
 
	
	String reversed ="";

	
		String[] input = strnew2.split(" ");
		
for(int i=0;i<input.length;i++)
{
	String revword = reverseword(input[i]); //yM name
	reversed+=revword+" "; 
		
}

int num=245771;

int rev = reversenum(num);
System.out.println("String Reversed"+reversed);
System.out.println("Numvber Reversed"+rev);

		
}

	public static String reverseword(String word)
	{
		StringBuffer sb = new StringBuffer(word);
		return sb.reverse().toString();
	}

	
	public static int reversenum(int num)
	{
		int digit = 0;
		int reversed=0;
		while(num!=0)
		{
			digit=num%10;
			reversed= reversed*10+digit;
			num/=10;
		}
		return reversed;
	}


	
}
