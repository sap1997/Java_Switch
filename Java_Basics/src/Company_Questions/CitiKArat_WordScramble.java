/*You are running a classroom and suspect that some of your students are passing around the answer to a multiple-choice question disguised as a random note.

Your task is to write a function that, given a list of words and a note, finds and returns the word in the list that is scrambled inside the note, if any exists. If none exist, it returns the result "-" as a string. There will be at most one matching word. The letters don't need to be in order or next to each other. The letters cannot be reused.

Example:  
words = ["baby", "referee", "cat", "dada", "dog", "bird", "ax", "baz"]
note1 = "ctay"
find(words, note1) => "cat"   (the letters do not have to be in order)  
  
note2 = "bcanihjsrrrferet"
find(words, note2) => "cat"   (the letters do not have to be together)  
  
note3 = "tbaykkjlga"
find(words, note3) => "-"     (the letters cannot be reused)  
  
note4 = "bbbblkkjbaby"
find(words, note4) => "baby"    
  
note5 = "dad"
find(words, note5) => "-"    
  
note6 = "breadmaking"
find(words, note6) => "bird"    

note7 = "dadaa"
find(words, note7) => "dada"    */

package Company_Questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CitiKArat_WordScramble {
	
	public static void main(String args[])
	{
		String[] words = {"baby", "referee", "cat", "dada", "dog", "bird", "ax", "baz"};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the note");
		String note = sc.next();
		String result = find(words,note);
		System.out.println("Result is "+result);
	}

	private static String find(String[] words, String note) {
		// TODO Auto-generated method stub
		Map<Character,Integer> notecount = countwordchar(note);
		System.out.println(notecount);
		for(String word:words)
		{
			if(canformwords(word,notecount))
			{
				return word;
			}
		}
		return "-";
	}

	private static boolean canformwords(String word, Map<Character, Integer> notecount) {
		Map<Character,Integer> notechar = countwordchar(word);
		for(Map.Entry e:notechar.entrySet())
		{
			char c = (char) e.getKey();
			int count = (int) e.getValue();
			if(notecount.getOrDefault(c,0)<count)
			{
				return false;
			}
		}
		
		
		return true;
	}

	private static Map<Character, Integer> countwordchar(String note) {
		// TODO Auto-generated method stub
		
		Map<Character,Integer> notecount = new HashMap<>();
		for(char notes:note.toCharArray())
		{
			notecount.put(notes,notecount.getOrDefault(notes, 0)+1);
		}
		return notecount;
	}

}
