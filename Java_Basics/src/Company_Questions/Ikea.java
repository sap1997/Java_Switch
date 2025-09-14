package Company_Questions;
import java.util.*;

/*Given a sorted array and a target, return the index of target (or -1 if not found)*/

public class Ikea {
	public static void main(String args[])
	{
		//[2,3,4,7] , target = 7
		int ar[] = {1,2,3,4,5,6};
		int target = 4;
		int start =0;
		int end = ar.length; //5
		int mid = (start+end)/2; //2
		int result = -1;
		while(mid!=)
		{		
		if(target<mid)
		{
			end = mid-1;
			mid=(start+end)/2;
		}
		else if(target>mid)
		{
			start = mid; 
			mid=(start+end)/2;
		}
		else
		{
			result = mid-1;
		}
		}
		System.out.println(result);
	}

}

/*doc has multiple of students , student joined into multiple courses , one course with one doc 


ONE TO MANY ,ONE TO MANY, ONE TO ONE
*/