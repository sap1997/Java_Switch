package Company_Questions;
import java.util.*;
public class Accolite_Second {
	public static void main(String args[])
	{
		
		List<Integer> input = Arrays.asList(2,4,1,5,7,6);

		Optional<Integer> result = input.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		if(result.isPresent())
		{
			System.out.println(result.get());
		}
	}

}
