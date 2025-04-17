package Basics;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
public class playwithchar {
	public static void main(String args[])
	{
		String s = "I love my 123 country";
		Map<Character, Long> result = s.chars().mapToObj(c -> (char) c).map(Character::toLowerCase).filter(Character::isLetter).collect(Collectors.groupingBy(c->c, Collectors.counting()));
		System.out.println(result);
		
		
		 Map<Character, Long> charCountMap = 
                 s.chars()
                             .mapToObj(c -> (char) c)
                             .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
      System.out.println(charCountMap);
      
      List<Integer> lis = Arrays.asList(1,2,3,3,4,5,6,6,2);
      Map<Object, Long> chars = new HashMap<>();
     // chars = lis.stream().collect(Collectors.groupingBy(c->c,Collectors.counting()));
      
      chars.entrySet().stream().filter(entry->entry.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
      
      System.out.println(chars);
      

	}

}
