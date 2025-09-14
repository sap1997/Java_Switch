package Company_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LIST_ANAGRAM {
	
	   public static void main(String[] args) {
	        String[] input = {"listen", "silent", "enlist", "hello", "below", "elbow", "stone", "tones", "onest"};

	       List<List<String>> output = groupAnagram(input);
	       for(List<String> word :output)
	       {
	    	   if(word.size()>1)
	    		   System.out.println(word);
	       }
	   }



	private static List<List<String>> groupAnagram(String[] input) {
		// TODO Auto-generated method stub
		Map<String,List<String>> results = new HashMap<>();
		for(String word: input)
		{
			char[] ch = word.toCharArray();
			Arrays.sort(ch);
			String temp = new String(ch);
			results.computeIfAbsent(temp, k->new ArrayList<>()).add(word);
		}
		return new ArrayList<>(results.values());
	}
}
