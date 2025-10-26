package Basics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {
	public static void main(String args[])
	{
		String a ="ACAT";
		String b= "ACAA";
		
		System.out.println(isanagram(a,b));
	}

	private static boolean isanagram(String a, String b) {
		// TODO Auto-generated method stub
		if(a.length()!=b.length())return false;
	 Map<Character,Integer> result = new HashMap<>();
	 for(char ch :a.toCharArray())
	 {
		 result.put(ch,result.getOrDefault(ch,0)+1);
	 }
	 for(char ch :b.toCharArray())
	 {
		 result.put(ch,result.getOrDefault(ch,0)-1);
		 if(result.get(ch)<0)
			 return false;
	 }
	 return true;
	 
	}
	
	

}
