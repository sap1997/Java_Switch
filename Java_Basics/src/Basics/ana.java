package Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ana {
	 public static void main(String[] args) {
	        String[] input = {"listen", "silent", "enlist", "hello", "below", "elbow", "stone", "tones", "onest"};

	        List<List<String>> result = groupAnagrams(input);

	        for (List<String> group : result) {
	        	if (group.size() > 1) 
	            System.out.println(group);
	        }
	    }

	private static List<List<String>> groupAnagrams(String[] input) {
	    Map<String,List<String>> map = new HashMap<>();
	    for(String word : input)
	    {
	    	char[] ch = word.toCharArray();
	    	Arrays.sort(ch);
	    	String sum = new String(ch);
	    	map.computeIfAbsent(sum, k->new ArrayList<>()).add(sum);
	    }
	    return new ArrayList<>(map.values());
	}


}
