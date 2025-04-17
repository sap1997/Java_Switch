package Basics;

import java.util.Optional;

public class optionalss {
	//String s=null;
	public static void main(String args[])
	{
	Optional<String> s =Optional.ofNullable("null");
	if(s.isPresent())
	{
		System.out.println(s.get());
	}
	else
	{
		System.out.println("Is Null");
	}


	
	}
	

}
