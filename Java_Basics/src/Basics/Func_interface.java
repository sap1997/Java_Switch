package Basics;
import java.io.*;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
public class Func_interface {
public static void main(String args[])
{
	Consumer<String> Username = name -> System.out.println("Hi All "+name);
	Username.accept("John");
	
	Predicate<Integer> isodd = num -> num%2 ==0;
	System.out.println(isodd.test(10));
	System.out.println(isodd.test(55));

	
	Supplier<Double> rand = ()->Math.sqrt(10000);
	System.out.println(rand.get());
	
	//Function<String> func =

	
	
}
}
