package Company_Questions;
import java.util.*;
import java.util.stream.Collectors;
public class NTT_UniqueChars {
	public static void main(String args[])
	{
		String s = "aabccd";
		

		Set<Character> uniquechars = new HashSet<>();

		uniquechars = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()))
						.entrySet().stream().filter(e->e.getValue()==1).map(e->e.getKey()).collect(Collectors.toSet());
		
		System.out.println(uniquechars);

		Map<Character,Integer> charcount = new HashMap<>();
		Set<Character> uniques = new HashSet<>();
		for(char c :s.toCharArray())
		{
			charcount.put(c, charcount.getOrDefault(c, 0)+1) ;
		}
		
		for(Map.Entry<Character,Integer> kv : charcount.entrySet())
		{
			if(kv.getValue()==1)
			{
				uniques.add(kv.getKey());
			}
		}
		System.out.println("Uniques in traditional way is "+uniques);
	}

}
