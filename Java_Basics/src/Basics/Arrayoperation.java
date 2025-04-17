package Basics;

public class Arrayoperation {
	public static void main(String args[])
	{
		int[] ar = {1,0,2,1,3,0,5};
		//output=1213500
	    int i=0;
	    int j =ar.length;
	    int temp=0;
	    while(i<j)
	    {
	    	if(ar[i]==0)
	    	{
	    		temp = ar[i];
	    		ar[i]=ar[j];
	    		ar[j]=temp;
	    		
	    		
	    	}
	    	
	    	i++;
	    	j--;
	    	
	    	
	    }
	    for(int res = 0;res<ar.length;res++)
	    {
	    	System.out.print(ar[res]+" ");
	    }
		 
	}

}
