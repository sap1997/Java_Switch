import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
public class zerosatlast {
	public static void main(String args[])
	{
		int ar[]= {2,4,0,6,8,0};
		List<Integer> result = Arrays.stream(ar).filter(x->x!=0).boxed().collect(Collectors.toList());
		for(int i=result.size()-1;i<ar.length-1;i++)
		{
		 result.add(0);
		}
		System.out.println(result);
		
	}

}
