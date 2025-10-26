
public class Practices {
	
	public static void main(String args[])
	{
		int ar[] = {1,1,1,1,2,2,2,3,4,5,5,6};
		int i=2;
		for(int j=3;j<ar.length;j++)
		{
			if(ar[j]!=ar[i-2])
			{

				i++;
				ar[i]=ar[j];


			}
		}
		for(int idx=0;idx<=i;idx++)
		{
			System.out.print(ar[idx]+" ");
		}
	}

}
