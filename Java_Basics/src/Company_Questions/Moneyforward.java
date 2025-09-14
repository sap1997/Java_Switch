package Company_Questions;
import java.util.*;
public class Moneyforward {
	
	public static void main(String args[])
	{
		int ar[]= {9,1,5,6,2};
		List<Integer> result = new ArrayList<>();
		Arrays.sort(ar);
		for(int i=ar.length-1;i>0;i--)
		{
			if(ar[i-1]==ar[i]-1)
			{
				result.add(ar[i]);
				result.add(ar[i-1]);
				break;
			}
		}
		System.out.println(result);
	}

}
