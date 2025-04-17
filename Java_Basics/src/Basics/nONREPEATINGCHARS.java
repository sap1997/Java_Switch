package Basics;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class nONREPEATINGCHARS {
	public static void main(String args[])
	{
		String s = "apple";
		Map<Character,Long> m = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(n->n,Collectors.counting()));
		
		Optional<Character> firstnon;
		firstnon =s.chars().mapToObj(c->(char)c).filter(c->m.get(c)==1).findFirst();
		if(firstnon.isPresent())
		{
			System.out.println(firstnon.get());
		}
		String vow = "This is vowelcount";
		Map<Character,Long> vowcount=vow.chars().mapToObj(c->(char)c).filter(c->"aeiou".indexOf(c)!=-1).collect(Collectors.groupingBy(c->c,Collectors.counting()));
		System.out.println(vowcount);
		
		
	}

}
