package Basics;
import java.io.*;
public class Singleton_Class {
	private static Singleton_Class single_instance;
	
	Singleton_Class()
	{
		
	}
	public static  Singleton_Class getobj()
	{
		if(single_instance==null)
		{
			single_instance=new Singleton_Class();
		}
		return single_instance;
	}
	
	

}
