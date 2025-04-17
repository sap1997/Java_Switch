import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class flats {
	
	public static void main(String args[])
	{
	String[] array = {"Java,Spring","Java,Hibernate,Java","Spring,SpringBoot,Java","SQL","Java"};
	
	Map<String,Long> result = Arrays.stream(array).flatMap(s->Arrays.stream(s.split(",")))
							  .collect(Collectors.groupingBy(n->n,Collectors.counting()));
	
	System.out.println(result);

	
	}

}