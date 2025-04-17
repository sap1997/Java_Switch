package Basics;
import java.util.*;
import java.util.function.Function;
public class Functionals {
	public static void main(String args[]) {
		Function<String,String> s = e->e.toUpperCase();
		s.apply("hi");
		System.out.println(s.apply("hi"));
	}

}
