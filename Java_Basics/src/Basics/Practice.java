package Basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practice {

	public static void main(String[] args) {
        String input = "aaabbc";
        char res = secondhighestchar(input);
        System.out.println("Second highest is "+res);
    }

	private static char secondhighestchar(String input) {
		// TODO Auto-generated method stub
		char result =' ';
		Map<Character,Integer> freqmap = new LinkedHashMap<>();
		for(char ch : input.toLowerCase().toCharArray())
		{
			freqmap.put(ch, freqmap.getOrDefault(ch, 0)+1);
		}
		Set<Integer> uniques = new HashSet<>(freqmap.values());
		List<Integer> uniquelist = new ArrayList<>(uniques);
		Collections.sort(uniquelist,Collections.reverseOrder());
		int index = uniquelist.get(1);
		for(Map.Entry<Character,Integer> res : freqmap.entrySet())
		{
			if(res.getValue()==index)
			{
				result = res.getKey();
				break;
			}
		}
		return result;
	}
}
