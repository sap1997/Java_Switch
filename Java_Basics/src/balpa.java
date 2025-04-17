import java.util.Stack;

public class balpa {
	 public static void main(String[] args) {
	        String input =  "{[()]}";  // Try changing this to test different cases
	        boolean result = isBalanced(input);
	        System.out.println("Is balanced? " + result);
	    }

	private static boolean isBalanced(String input) {
		// TODO Auto-generated method stub
		Stack<Character> st = new Stack();
		for(char ch : input.toCharArray())
		{
			if(ch=='(' || ch=='{' || ch=='[')
				st.push(ch);
			else if (ch==')' || ch=='}' || ch==']')
			{
				if(st.isEmpty())
					return false;
				char top=st.pop();
				if((top=='(' && ch!=')')||
					(top=='{' && ch!='}')||
					(top=='[' && ch!=']'))
					return false;
				
			}
			
			
			
		}
		return st.isEmpty();
		
	}

}
