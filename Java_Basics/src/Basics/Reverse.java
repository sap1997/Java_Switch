package Basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse {
	public static void main(String args[])
	{
		String s = "This is amazing";
		List<String> cut = Arrays.asList(s.split(" "));
		Collections.reverse(cut);
		String reverse =String.join(" ", cut);
		System.out.println(reverse);
	}

}
