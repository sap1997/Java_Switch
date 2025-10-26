package Java8;

public class Functional {
	
	public static void main(String args[])
	{
		sum add = (a,b)->a+b;
		sum mul = (a,b)->a*b;
		System.out.println(add.calculate(5, 6));
		System.out.println(mul.calculate(5, 6));
	}

}
