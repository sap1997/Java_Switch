//{"appe","bat","can","da","yui"}
package Company_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Accolite_SEptember {
	
	public static void main(String args[])
	{
		List<String> words = Arrays.asList("appe","bat","can","da","yui");
		int size =3;
		
		List<String> output = words.stream().filter(c->c.length()==size).collect(Collectors.toList());
		System.out.println(output);
		
		List<String> outputnormal = new ArrayList<>();
		for(String word:words)
		{
			if(word.length()==size)
				outputnormal.add(word);
		}
		System.out.println("Words without java8");
		
	}

	
}
