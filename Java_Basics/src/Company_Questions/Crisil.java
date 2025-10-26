package Company_Questions;
public  class Crisil
{

	public static class Payments
	{
	
	public  double calculate(int principal)
	{
		System.out.println("Inside Payments Parent Class");
	    double interest = 5/100.0;
	    double interestamt = principal*interest;
	    return interestamt;
	}
	}


public  static  class UpiPayments extends Payments
{

	public  UpiPayments()
	{
		
	}
	public  double calculate(int principal)
	{
		System.out.println("Inside UpiPayments Child Class");
	    double interest = 6/100.0;
	    double interestamt = principal*interest;
	    System.out.println("Interestamt is "+interest);
	    return interestamt;
	}
}

public static void main(String args[])
{
	Payments pay = new UpiPayments();
	double interest = pay.calculate(500);
	
	
}
}






