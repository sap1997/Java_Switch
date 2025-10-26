package Basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Double {
    public static void main(String[] args) {
        String input = "a";
        char res = secondhighestchar(input);
        System.out.println("Second highest is "+res);
    }

	private static char secondhighestchar(String input) {
		// TODO Auto-generated method stub
		Map<Character,Integer> count = new LinkedHashMap<>();
		char res = ' ';
		for(char c : input.toLowerCase().toCharArray())
		{
			count.put(c, count.getOrDefault(c, 0)+1);
		}
		Set<Integer> uniques = new HashSet<>(count.values());
		List<Integer> resultset = new ArrayList<>(uniques);
		Collections.sort(resultset,Collections.reverseOrder());
	    if (resultset.size() < 2) {
           res=' ';	    }
	    else
	    {
	    	int secondhighestfreq = resultset.get(1);
	    	for(Map.Entry<Character,Integer> rs : count.entrySet())
	    	{
	    		if(rs.getValue()==secondhighestfreq)
	    		{
	    			res=  rs.getKey();
	    			break;
	    		}
	    	}
        }
	    return res;

		
	}
}