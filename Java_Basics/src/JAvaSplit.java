import java.io.*;
import java.util.*;
public class JAvaSplit {

	
	public static void main(String args[])
	{
		String s = "Hello,World";
		List<String> seperate = Arrays.asList(s.split(","));
		Collections.reverse(seperate);
		String result = String.join(",", seperate);
		System.out.println(result);
	}
}
