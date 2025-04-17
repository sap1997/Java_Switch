
public class Trip {


	  public static void main(String[] args) {
	        int[] arr = {1, 3, 2, -1, 5, 1};
	        int target =3;
	        findTriplets(arr, target);
	    }

	private static void findTriplets(int[] ar, int target) {
		
		int sum;
		for(int i=0;i<ar.length-2;i++)
		{
			int left =i+1;
			int right = ar.length-1;
			while(left<right)
			{
				sum =ar[i]+ar[left]+ar[right];
				if(sum==target)
				{
					System.out.print(ar[i]+","+ar[left]+","+ar[right]);
					while (left < right && ar[left] == ar[left + 1]) left++;
	                while (left < right && ar[right] == ar[right - 1]) right--;
	                left++;
	                right--;
				}
				else if(sum<target)
					left++;
				else
					right--;
			}
		}
		
	}

}
