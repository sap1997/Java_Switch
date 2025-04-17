import java.util.HashMap;
import java.util.Map;

public class hashtest {
public static void main(String args[])
{
	Map<Integer,String> m = new HashMap<>();
	m.put(1, "Hi");
	m.put(2, "Hello");
	m.put(1, "Bye");
	System.out.println(m);
}
}
