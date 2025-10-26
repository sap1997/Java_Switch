//['ab','ba','act','cat','tac','test']
//output
//[['ab','ba'],['act','cat','tac'],['test']]*/
package Company_Questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class fiserv_anagram {
	
	public static void main(String args[])
	{
		/*List<String> words = Arrays.asList("ab","ba","act","cat","tac","test");
		groupAnagram(words);*/
		
		List<Object>elements = Arrays.asList(1, null, "one", "two", 4,5 ,6);
		
		
		Double averageofnum = elements.stream().filter(e-> e instanceof Integer).collect(Collectors.averagingDouble(e->Double.parseDouble((Integer) e)));
		
		System.out.println(averageofnum);
		
		
	}

	private static void groupAnagram(List<String> words) {
		Map<String,String> anagrams = new HashMap<>();
		for(String word : words)
		{
			Arrays.sort(word.toCharArray()); //ab ab act act act test
			String newword = word.toString();
			anagrams.getOrDefault(word, newword+1);
					
		}		
		
	System.out.println(anagrams);		
	}
	
}
