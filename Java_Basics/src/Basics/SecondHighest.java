package Basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SecondHighest {
	public static void main(String args[])
	{
		List<Integer> num = new ArrayList<>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		
		Optional<Integer> result = num.stream().sorted((a,b)->a-b).skip(1).findFirst();
		System.out.println(result.get());
	}

}
