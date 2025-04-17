package Basics;
import java.util.*;
import java.util.stream.Collectors;
public class Oddeven {
	public static void main(String args[])
	{
		List<Integer> numbers = new ArrayList<Integer>();
		List<Integer> oddnumbers = new ArrayList<Integer>();
		List<Integer> evennumbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(4);
		numbers.add(5);
		oddnumbers = numbers.stream().filter((x->x%2!=0)).collect(Collectors.toList());
		evennumbers = numbers.stream().filter((x->x%2==0)).collect(Collectors.toList());
		System.out.println("Even Numbers are "+evennumbers);
		System.out.println("Odd Numbers are "+oddnumbers);


		

		
		
	}

}
