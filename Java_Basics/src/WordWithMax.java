import java.util.HashMap;
import java.util.Map;

public class WordWithMax {
    public static void main(String[] args) {
        String sentence = "apple banana mississippi elephant";
        String result = findWordWithMostRepeatingChars(sentence);
        System.out.println("Word with most repeating characters: " + result);
    }

	private static String findWordWithMostRepeatingChars(String sentence) {
		// TODO Auto-generated method stub
		String[] words = sentence.split("\\s+");
		String resultword="";
		int maxcount =0;
		for(String word:words)
		{
			int repeatcount = findcountofchars(word);
			if(repeatcount>maxcount)
			{
				maxcount = repeatcount;
				resultword = word;

			}
		}
		return resultword;
		
	}

	private static int findcountofchars(String word) {
		Map<Character,Integer> result = new HashMap<>();
		int max=0;
		for(char ch : word.toCharArray())
		{
			result.put(ch, result.getOrDefault(ch,ch+0)+1);
			max = Math.max(max,result.get(ch));
		}
		
		// TODO Auto-generated method stub
		return max;
	}

}
