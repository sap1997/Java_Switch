package Basics;
import java.util.*;
public class vowelcount {
	public static void main(String args[])
	{
		String s = "Hello Welcome";
		s=s.toLowerCase();
		int vowelcount=0;
		int count = (int) s.chars().mapToObj(c->(char)c).filter(c -> "aeiouAEIOU".indexOf(c) != -1).count();
		System.out.println(count);

}
}
