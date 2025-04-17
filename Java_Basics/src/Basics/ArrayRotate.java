package Basics;
import java.util.*;
public class ArrayRotate {
	public static void main(String args[])
	{
		List<Integer> li = new ArrayList<>();
		li.add(5);
		li.add(6);
		li.add(7);
		li.add(8);
		System.out.println(li);
		Collections.rotate(li,2);
		System.out.println(li);
		
	}

}
