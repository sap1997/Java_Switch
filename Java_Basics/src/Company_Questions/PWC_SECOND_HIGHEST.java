package Company_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PWC_SECOND_HIGHEST {
	public static void main(String args[])
	{
		int ar[] = {2,4,5,6,3};
		int highest=0;
		int second = 0;
		for(int i=0;i<ar.length;i++)
		{
			 if (ar[i] > highest) {
	                second = highest;
	                highest = ar[i];
	            } else if (ar[i] > second && ar[i] != highest) {
	                second = ar[i];
	            }
		}
		System.out.println(second);
	}

}
