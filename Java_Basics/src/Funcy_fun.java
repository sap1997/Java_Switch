
public class Funcy_fun {
	public static void main(String args[])
	{
		funcy add = (a,b)->a+b;
		funcy mul = (a,b)->(a*b);
		System.out.println(add.calculate(5, 6));
		System.out.println(mul.calculate(5, 6));

	}

}
