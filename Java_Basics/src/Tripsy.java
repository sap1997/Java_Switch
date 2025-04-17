import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Tripsy {
	
	  public static void main(String[] args) {
	        int[] arr = {1, 3, 2, -1, 5, 1};
	        int target =3;
	        findTripletsWithHashMap(arr, target);
	    }

	private static void findTripletsWithHashMap(int[] arr, int target) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		//int left =0;
		int left =0;
		int right = arr.length-1;
		for(int i=0;i<arr.length-2;i++)
		{
			//int left = i+1;
			//int right = arr.length-1;
			while(left<right)
			{
				int sum = arr[i]+arr[left]+arr[right];
				if(sum==target)
				{
					System.out.println(arr[i]+", "+arr[left]+", "+arr[right]);
					while (left < right && arr[left] == arr[left + 1]) left++;
	                while (left < right && arr[right] == arr[right - 1]) right--;
	                left++;
	                right--;
				}
				
			
				else if(sum<target)
				{
					left++;
				}
				else
				{
					right--;
				}
			}
			
		}
		
		}
	}


