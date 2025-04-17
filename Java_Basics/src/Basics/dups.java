package Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class dups {
	public static void main(String args[])
	{
		List<Integer> li = new ArrayList<>();
		li.add(2);
		li.add(2);
		li.add(3);
		li.add(4);
		
		List<Entry<Integer, Long>> res = li.stream().collect(Collectors.groupingBy((n->n),Collectors.counting())).entrySet().
				stream().filter(e -> e.getValue() > 1).collect(Collectors.toList());
		
				
		System.out.println(res);
		
		Set<Integer> set = new HashSet<>();
		
		Set<Integer> dup = li.stream().filter(n -> !set.add(n)).collect(Collectors.toSet());
		
		System.out.println(set +"space"+dup);
		
        List<String> words = Arrays.asList("apple", "canana", "cherry", "apple", "date", "banana", "fig");

		Optional<String> result = words.stream().max(Comparator.comparingInt(String::length));
		System.out.println(result.get());
		
		String s ="swiss";
		Optional<Character> out = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(n->n,Collectors.counting())).entrySet()
				.stream().filter(e-> e.getValue()==1).map(e->e.getKey()).findFirst();
		System.out.println(out.get());
		
	}

}
