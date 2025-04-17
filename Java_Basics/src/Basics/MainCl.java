package Basics;

public class MainCl {
	public static void main(String args[])
	{
		String a = "Hi"; //10  
		String b = "Hello"; //2
	//	a =b;
	     // Step 1: Concatenate both strings and assign to a
        a = a + b; // a = "HiHello"

        // Step 2: Extract original 'a' and assign to b
        b = a.substring(0, a.length() - b.length()); // b = "Hi"

        // Step 3: Extract original 'b' and assign to a
        a = a.substring(b.length()); // a = "Hello"
		System.out.println(a);
		System.out.println(b);

	}

}
