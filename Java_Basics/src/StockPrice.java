
public class StockPrice {
	 public static void main(String[] args) {
	        int[] prices =  {1, 3, 6, 9, 11} ;
	        System.out.println(maxProfit(prices));
	    }

	private static int maxProfit(int[] prices) {
		// TODO Auto-generated method stub
		
		int min =prices[0];
		int res=0;
		for(int i=0;i<prices.length;i++)
		{
			min = Math.min(min,prices[i]);
			res = Math.max(res,prices[i]-min);
		}
		return res;
		
	}

}
