package Basics;
import java.util.*;
public class pal_prime {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num;
		num =sc.nextInt();
		
		if(isPrime(num))
		{
			System.out.println("Number is Prime");
		}
		else
			System.out.println("Number is not prime");
		System.out.println("Factorial of number is  "+ factorial(num));

	}

	private static int factorial(int num) {
		int fact =1;
		for(int i =1;i<=num;i++)
		{
			fact*=i;
		}
		return fact;
	}

	private static boolean isPrime(int num) {
		int flag =0;
		for(int i =2;i<num/2;i++)
		{
			if(num%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
			
		return false;
		else
			return true;
	}

}
