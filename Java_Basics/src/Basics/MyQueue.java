package Basics;
import java.io.*;
import java.util.Arrays;
public class MyQueue {
	
 
	int size;
	int ar[] = new int[5];
	int index=0;
	int start=0;
	void add(int value)
	{
		if(index>ar.length)
		{
			int newarr[] = new int[index*2];
			for(int i=0;i<newarr.length;i++)
			{
				newarr[i]=ar[i];
			}
			 ar=newarr;
		   
		}
		ar[index]=value;
		index++;
		
		
	}
	int delete()
	{
		int value = ar[start];
		start++;
		//index--;
		return value;
	}
public String toString()
{
	StringBuilder output = new StringBuilder();
	
	for(int i=start;i<index;i++)
	{
	   //System.out.print(ar[i]);
	   output.append(ar[i]+" ");
	    
	}
	return output.toString();
}

public static void main(String args[])
{
	MyQueue obj = new MyQueue();
	obj.add(1);
	obj.add(2);
	obj.add(3);
	System.out.println(obj.toString());
	int value=obj.delete();
	System.out.println(value);
	int newval = obj.delete();
	System.out.println(newval);
	System.out.println(obj.toString());
	obj.add(4);
	obj.add(5);
	System.out.println(obj.toString());
	obj.add(6);
	obj.add(7);
	obj.add(8);
	System.out.println(obj.toString());
	
}
}
