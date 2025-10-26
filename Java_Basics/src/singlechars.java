import java.io.*;
import java.util.*;
public class singlechars {

	
	public static void main(String args[])
	{
		String s = "TTFFCCD";
		Set<Character> result = new HashSet<>();
		for(char ch : s.toCharArray())
		{
			if(!result.contains(ch))
				result.add(ch);
			if(ch==' ')
				continue;

		}
		System.out.println(result);
	}
}
