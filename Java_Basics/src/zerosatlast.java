import java.util.*;
import java.util.stream.*;
public class zerosatlast {
	public static void main(String args[])
	{
			String s = "Hello World";
			List<Character> words = s.chars().mapToObj(c->(char)c).collect(Collectors.toList());
			Collections.reverse(words);
			System.out.println(words.toString());
	}

}
