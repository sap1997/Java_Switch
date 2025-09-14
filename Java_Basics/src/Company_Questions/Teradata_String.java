/*Input: arr[] = [“act”, “god”, “cat”, “dog”, “tac”]
Output: [[“act”, “cat”, “tac”], [“god”, “dog”]]
 
Input: arr[] = [“listen”, “silent”, “enlist”, “abc”, “cab”, “bac”, “rat”, “tar”, “art”]
Output: [[“abc”, “cab”, “bac”], [“listen”, “silent”, “enlist”],[“rat”, “tar”, “art”]]*/
package Company_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Teradata_String {
	public static void main(String args[])
	{
		
		String arr[] = {"act", "god", "cat", "dog", "tac"};
		String[] result = isanagram(arr);
		
		
	}

	private static String[] isanagram(String[] arr) {
		// TODO Auto-generated method stub
		Map<String,String> wordfreq = new HashMap<>();
		Map<Character,Integer> charfreq = new HashMap<>();
    
		String result[];
		for(String ch:arr)
		{
		//	Arrays.sort(ch.toCharArray());
			char[] temp = ch.toCharArray();
		   Arrays.sort(temp);
		  if(wordfreq.containsValue(temp))
				  {
			  wordfreq.put(ch,wordfreq.getOrDefault(ch,temp)+1);
				  }
		  wordfreq.put(ch,wordfreq.getOrDefault(ch,res));

		}
		
		System.out.println(wordfreq);
		return arr;
	}
	

}
