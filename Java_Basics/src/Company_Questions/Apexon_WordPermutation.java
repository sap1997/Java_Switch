/*
 * Given a string str, the task is to print all the permutations of str. 
 * A permutation is an arrangement of all or part of a set of objects, with regard to the 
 * order of the arrangement. For instance, the words ‘bat’ and ‘tab’ represents two distinct permutation 
 * (or arrangements) of a similar three letter word.

Examples: 
Input: str = "cd" 
Output: cd dc

Input: str = "abb" 
Output: abb abb bab bba bab bba 

 */
package Company_Questions;
import java.util.*;
public class Apexon_WordPermutation {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Enter Word");
		str = sc.next();
		Set<String> resultSet = new HashSet<>();
		printpermutation(str,"",resultSet);
	}

	private static void printpermutation(String str,String ans, Set<String> resultSet) {
		if(str.length()==0)
		{
		    if (!resultSet.contains(ans)) {
		        System.out.print(ans + ",");
		        resultSet.add(ans);
		    }
		    return;
		}

		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			String left = str.substring(0,i);
			String right = str.substring(i+1);
			String rem = left+right;
			printpermutation(rem,ans+ch,resultSet);
		}
		
		
	}

}
