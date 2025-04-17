package Basics;

public class fibs {
	public static void main(String args[])
	{
		int n1=0;
		int n2 =1;
		int n3;
		System.out.print(n1+" "+n2);
		for(int i=2;i<10;i++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
		}
		System.out.println();
		int num =263;
		int digit=0;
		int ref =num;
		int rev=0;
		while(num!=0)
		{
			digit=num%10;
			rev=rev*10+digit;
			num/=10;
			
		}
		System.out.println("Reverse is "+rev);
	}

}
