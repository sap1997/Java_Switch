import Basics.functest;

public class functionalinterface  {
	public static void main(String args[])
	{
		functest fn = (a,b)->a*b;
		int val = fn.mul(2,5);
		System.out.println(val);
	}

}
