package Company_Questions;
import java.util.*;
import java.util.stream.Collectors;
public class MSBC {
	public static void main(String args[])
	{
		List<String> words = Arrays.asList("Apple","Banana","Apricot");
		List<String> wordswitha = words.stream().filter(s->s.startsWith("A")).collect(Collectors.toList());
		System.out.println();
		stringtest();
	}
	public static void stringtest()
	{
		String s ="test";
		s=s.toLowerCase();
		int index =0;
		int length = s.length()-1;
		boolean ispal = true;
		while(index<s.length()) 
{
	if(s.charAt(index)!=s.charAt(length))
	{
		ispal = false;
		break;
	}
	index++;
	length--;
}
		if(ispal==true)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
	
	/*Logic to group anagrams:
		 
		I/p: ["eat", "tea", "tan", "ate", "nat", "bat"]

		o/p [["bat"], ["nat", "tan"], ["eat", "tea",  "ate"]]*/
	
	
	
	public static void groupanagram()
	{
		List<String> words = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
		List<List<String>> anagrams = new ArrayList<>();
		
		for(String word : words)
		{
			char[] wordchars = word.toCharArray();
			Arrays.sort(wordchars);//aet
			//String so
		}
	}

	EMPLOYEE = ID,NAME,SALARY,DEPT_ID;
	DEPARTMENT = ID,NAME;
	
SELECT D.NAME,E.SALARY FROM DEPARTMENT D INNER JOIN EMPLOYEE E ON D.ID = E.DEPT_ID 
WHERE E.SALARY=(SELECT MAX(SALARY) FROM EMPLOYEE E2 GROUP BY E.DEPT_ID);

}


