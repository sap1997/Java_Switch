package Basics;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
public class Mappg {
	public static void main(String args[])
	{
		Map<String,Integer> inp = new HashMap<>();
		inp.put("one", 1);
		inp.put("two", 2);
		for(Map.Entry m:inp.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		String s ="I love my India";
		char[]ch = s.toCharArray();
		Map<Character,Integer> res = new HashMap<Character, Integer>();
		for(char c:ch)
		{
			if(res.containsKey(c))
			{
				res.put(c, res.get(c)+1);
			}
			else if(c==' ')
			{
				continue;
			}
			else
				res.put(c, 1);
		}
		for(Map.Entry e : res.entrySet())
		{
			System.out.print(e.getKey()+" "+e.getValue());
		}
		System.out.println();
		Map<Character,Long> out = new HashMap<Character, Long>();
		out = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
		System.out.println(out);
		
		String sm="PPAADS";
		String newres = sm.chars().distinct().mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());
		System.out.println(newres);
		
		List<Integer> ar = new ArrayList<>();
		ar.add(1);
		ar.add(3);
		ar.add(5);
		ar.add(2);
		ar.add(2);
		List<Long> num = ar.stream().collect(Collectors.groupingBy(n->n,Collectors.counting())).entrySet().stream().filter(e->e.getValue()>1).map(Map.Entry::getValue).collect(Collectors.toList());
		
System.out.println(num);
	}

}
