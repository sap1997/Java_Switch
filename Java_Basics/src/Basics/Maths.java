package Basics;
import java.io.*;
import java.util.*;
import java.util.*;
public class Maths {
	public static void main(String args[])
	{
		int a,b;
		int result;
		char choice;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b=sc.nextInt();
		choice = sc.next().charAt(0);
		try
		{
		switch(choice)
		{
		case '+':
					result = a+b;
					System.out.println("Sum is "+result);
					break;
					
		case '-':
			result = a-b;
			System.out.println("Sum is "+result);
			break;
			
		case '*':
			result = a*b;
			System.out.println("Sum is "+result);
			break;
			
		case '/':
			result = a/b;
			System.out.println("Sum is "+result);
			break;
			
		default:
			System.out.println("Wrong Choice");
		}
		}
		/*catch(ArithmeticException  e)
		{
			e.printStackTrace();
		}*/
		catch(InputMismatchException m)
		{
			m.printStackTrace();
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
		
		
	}

}
