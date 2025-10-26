//int arr[] = new int[]{12,56,76,89,100,343,21,234};
package Company_Questions;

import java.util.List;
import java.util.stream.Collectors;

import Employee;

public class Tsys_Arrays {

	public static void main(String args[])
	{
		int arr[] = new int[]{12,56,76,89,100,343,21,234};
		int largest;
		int smallest;
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		largest = arr[0];
		smallest = arr[arr.length-1];
		
		System.out.println("Largest is " +largest+ " Smallest is "+smallest);
		
		List<Employee> emp = new ArrayList<>;
		
		List<String>  uniquenames = emp.stream().map(e->e.getName()).distinct().
}
