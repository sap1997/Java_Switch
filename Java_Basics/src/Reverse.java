import java.util.*;
import java.util.stream.Stream;
public class Reverse {
	public static void main(String args[])
	{
		String s = "Hello World";
		
		String res = s.chars().mapToObj(c->String.valueOf((char)c)).reduce("",(a, b) -> b + a);
		System.out.println(res);
		
		
		int num = 1234;
		
		String rev = String.valueOf(num).chars().mapToObj(c->String.valueOf((char)c))
						.reduce("",(a,b)->b+a);
		
		System.out.println(Integer.parseInt(rev));
		
				
		
	}

}
