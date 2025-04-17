import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Numplay {

	public static void main(String args[])
	{
		int a = 1234432;
		Map<Object, Long> res =String.valueOf(a).chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(n->n,Collectors.counting()));
		System.out.println(res);
	}
}
