import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class BiggerEven {
	
	    public static void main(String[] args) {
	        int[] arr = {4, 2, 4, 6, 2, 6, 8};
	        int result = findMostFrequentEven(arr);
	        System.out.println("Most frequent even number: " + result);
	    }

		private static int findMostFrequentEven(int[] arr) {
			
			Map<Integer,Integer> count =  new HashMap<>();
			for(int i=0;i<arr.length;i++)
			{
				if(i%2==0)
				count.put(arr[i],count.getOrDefault(arr[i], 0)+1);
			}
			int maxfreq =0;
			int res =-1;
			for(Map.Entry<Integer, Integer>rev :count.entrySet())
			{
				int num = rev.getKey();
				int freq = rev.getValue();
				if(freq>maxfreq)
				{
					maxfreq = freq;
					res = num;

				}
				 else if (freq == maxfreq && num > res) {
		                res = num;
		            }
			}
			return res;
			
			
		}
			
}
