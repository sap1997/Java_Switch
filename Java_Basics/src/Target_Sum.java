import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Target_Sum {
	  public static void main(String[] args) {
	        int[] arr = {1, 3, 2, -1, 5,1};
	        int target = 2;
	        hasPairWithSum(arr, target);
	       // System.out.println();  // Output: true
	    }

	private static void hasPairWithSum(int[] arr, int target) {
		// TODO Auto-generated method stub
		
		Map<Integer,Boolean> result = new HashMap<>();
        Set<String> printed = new HashSet<>(); // To avoid duplicate pairs

		for(int ar : arr)
		{
			int left = target-ar;
			if(result.containsKey(left))
			{
				int a = Math.min(ar, left);
				int b = Math.max(ar, left);
				String pair = a+" , "+b;
				if(!printed.contains(pair))
				{
					System.out.println(a+" , "+b);
					printed.add(pair);
				}
				
			}
			
			result.put(ar, true);
		}
	
	}

}
