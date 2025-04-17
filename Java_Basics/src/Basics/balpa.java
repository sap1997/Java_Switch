package Basics;
import java.util.*;
public class balpa {
	 public static void main(String[] args) {
	        String test1 = "{[()]}"; // Balanced
	        String test2 = "{[(])}"; // Not balanced
	        String test3 = "{[}";    // Not balanced
	        
	        System.out.println(isBalanced(test1)); // true
	        System.out.println(isBalanced(test2)); // false
	        System.out.println(isBalanced(test3)); // false
	    }
	 
	 public static boolean isBalanced(String s)
	 {
		 Stack<Character> st = new Stack<>();
		 for(char c: s.toCharArray())
		 {
			 if(c=='(' || c=='{' || c=='[')
			 {
				 st.push(c);
			 }
			 else if(c==')' || c=='}' || c==']')
			 {
				 if(st.isEmpty()) return false;
				 
			 
			 char top = st.pop();
			 if((c==')' && top!='(')
				 ||
				 (c=='}' && top!='{')
				 ||
				 (c==']' && top!='['))
				 {
				 return false;
				 }
			 }

		 }
		 return st.isEmpty();
		 
	 }

}
