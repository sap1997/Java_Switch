package Basics;
import java.util.*;
import java.util.stream.Collectors;
public class vowelcount {
	public static void main(String args[])
	{
		String s = "Hello Welcome";
		s=s.toLowerCase();
		int vowelcount=0;
		Map<Character,Long> count =  s.chars().mapToObj(c->(char)c).filter(c -> "aeiouAEIOU".indexOf(c) != -1).collect(Collectors.groupingBy(n->n,Collectors.counting()));
		System.out.println(count);
		
		Map<Character,Integer> result = new HashMap<>();
		for(char ch :s.toCharArray())
		{
			if(result.containsKey(ch))
			{
				result.put(ch, result.getOrDefault(ch,0)+1);
			}
			else if(ch==' ')
				continue;
			else
			{
				result.put(ch, 1);
			}
		}
		for(Map.Entry e : result.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}

}
}
