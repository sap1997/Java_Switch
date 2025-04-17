package Basics;

/*Write a program to print all combination of the given String. 

Examples :

String : ABC, Combinations : ABC, BCA, CAB, CBA, BAC, ACB

String : ABCD, Combinations : ABCD ABDC ACBD ACDB
ADBC ADCB BACD BADC BCAD BCDA BDAC BDCA CABD CADB CBAD CBDA CDAB CDBA DABC DACB DBAC DBCA DCAB DCBA*/
public class Stringcombos {
	public static void main(String args[])
	{
		String s ="ABC";
		int length =s.length();
		printPermutations(s);
		
	}
	  public static void printPermutations(String str) {
		  findcombinations(str, "");
	    }
	
	public static void findcombinations(String s,String output)
	{
		//String output="";
		if(s.length()==0)
		{
			System.out.println(output);
			return;
		}
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			String rem = s.substring(0,i)+s.substring(i+1);
			 //output=rem+ch;
			// System.out.print(output+" ");
			findcombinations(rem,output+ch);
			
	
		}
	}
}


