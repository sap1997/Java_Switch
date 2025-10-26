package Company_Questions;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Persistent_String {
	
	public static void main(String args[])
	{
		List<String> words = Arrays.asList("Apple","Banana","Guava","Kiwi");
		
		List<String> wordswitha = words.stream()
				.filter(e->e.chars().filter(ch->ch=='a').count()>1)
				.collect(Collectors.toList());
		
		System.out.println(wordswitha);
		

}
}
