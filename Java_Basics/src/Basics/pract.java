package Basics;

import java.util.Stack;

public class pract {
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
		 for(char ch : s.toCharArray())
		 {
			 if(ch=='(' || ch=='{' || ch=='[')
			 {
				 st.push(ch);
			 }
			 else if(ch==')' || ch=='}' || ch==']')
			 {
				 if(st.isEmpty()) return false;
				 char top = st.pop();
				 if((ch==')' && top!='(')||
						 (ch=='}' && top!='{') ||
						 (ch==']' && top!='['))
				 {
					 return false;
				 }
					 
			 }
		 }
		 return st.isEmpty();
	 }
}
