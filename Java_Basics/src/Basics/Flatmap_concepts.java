package Basics;
import java.util.*;
import java.util.stream.Collectors;
public class Flatmap_concepts {
	public static void main(String args[])
	{
		List<String> Input = Arrays.asList("Hi","Hello","Bye");
		List<String> Output =Input.stream().flatMap(i->i.stream()).collect(Collectors.toList());
		
	}

}