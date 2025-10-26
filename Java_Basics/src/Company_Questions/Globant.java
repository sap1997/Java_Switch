/*Given a string containing just the characters
'(', ')', '{', '}', '[' and ']', determine if the input string is valid. String - ({{[]}})*/
package Company_Questions;

import java.util.*;

public class Globant {

	public static void main(String args[])
	{
		String s = "({{[]}})";
		
		if(validateString(s)==true)
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("Invalud");
		}
		
	}

	private static boolean validateString(String s) {
		// TODO Auto-generated method stub
		Stack<Character> stack = new Stack<>();
		char top=' ';
		for(char ch : s.toCharArray())
		{
			stack.push(ch);
		}
		if(stack.isEmpty())
			return false;
		
		for(int i=0;i<stack.capacity();i++)
		{
			top = stack.pop();
			if((top == ']' && !stack.contains('[')) || ((top == '}' && !stack.contains('{')) 
					|| (top == ')' && !stack.contains('('))
					{
				return false;
					}
		}
		
	}
}




class Test {
    int x = 10;
}

public class Main {
    public static void main(String[] args) {
        Test a = new Test();
        Test b = a;
        b.x = 20;
        System.out.println(a.x);//10
    }
}




class Test {
    int x = 5;
}

public class Main {
    public static void main(String[] args) {
        Test a = new Test();
        Test b = new Test();
        a = b;
        a.x = 100;
        System.out.println(b.x);//5
    }
}
