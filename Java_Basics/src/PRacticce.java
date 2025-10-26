import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PRacticce {

	public static void main(String args[])
	{
		List<List<String>> words = Arrays.asList(
			    Arrays.asList("Apple"),
			    Arrays.asList("Banana")
			);		
	List<String> result= words.stream().flatMap(List::stream).filter(w->w.chars().filter(c->c=='a').count()>1)
								.collect(Collectors.toList());
	
	System.out.println(result);
		
	}

}
