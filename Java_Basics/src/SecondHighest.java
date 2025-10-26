public class SecondHighest {
    public static void main(String[] args) {
        int ar[] = {4, 5, 6, 3, 2, 6};
        int highest =0;
        int second =0;
        for(int i=0;i<ar.length;i++)
        {
        	if(ar[i]>highest)
        	{
        		second = highest;

        		highest = ar[i];

        		
        	}
        	if(ar[i]>second && ar[i]<highest)
        	{
        		second = ar[i];
        	}
        	
        
        }
        System.out.println(second);
    }
}