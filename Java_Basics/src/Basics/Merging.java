package Basics;

import java.util.Arrays;

public class Merging {
	 public static void main(String[] args) {
	        int[] array = {38, 27, 43, 3, 9, 82, 10};
	        System.out.println("Original array: " + Arrays.toString(array));
	        
	        mergeSort(array, 0, array.length - 1);
	        
	        System.out.println("Sorted array: " + Arrays.toString(array));
	    }

	    public static void mergeSort(int[] array, int left, int right) {
	        if (left < right) {
	            int mid = left + (right - left) / 2;
	            
	            mergeSort(array, left, mid);
	            mergeSort(array, mid + 1, right);
	            
	            merge(array, left, mid, right);
	        }
	    }
s1.equals(s2)
	    public static void merge(int[] ar, int left, int mid, int right) {
	    	int n1 = mid-left+1;
	    	int n2 = right-mid;
	    	
	    	int ar1[] = new int [n1];
	    	int ar2[] = new int [n2];
	    	
	    	for(int i =0;i<n1;i++)
	    	{
	    		ar1[i]=ar[left+i];
	    	}
	    	for(int j =0;j<n2;j++)
	    	{
	    		ar2[j]=ar[mid+1+j];
	    	}
	    	int i=0,j=0,k=left;
	    	while(i<n1 && j<n2)
	    	{
	    		if(ar1[i]<=ar2[j])
	    		{
	    			ar[k]=ar1[i];
	    			i++;
	    		}
	    		else
	    		{
	    			ar[k]=ar2[j];
	    			j++;
	    		}
	    		k++;
	    	}
	    	while(i<n1)
	    	{
	    		ar[k]=ar1[i];
	    		i++;
	    		k++;
	    	}
	    	while(j<n2)
	    	{
	    		ar[k]=ar2[j];
	    		j++;
	    		k++;
	    	}
	    	
	    	
	    }

}
