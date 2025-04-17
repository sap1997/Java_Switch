package Basics;

import java.util.LinkedHashSet;

public class LinkedHashsetss {
	public static void main(String args[])
	{
		LinkedHashSet<Character> lh = new LinkedHashSet<>();
        String s = "HappyNewYear";
        StringBuffer sb = new StringBuffer();
        for(char ch:s.toCharArray())
        {
        	if(lh.add(ch))
        	{
        		sb.append(ch);
        	}
        }
        System.out.println(sb.toString());
        
        int ar[]= {1,2,3,4,4,5,2,3,4};
        
		LinkedHashSet<Integer> unique = new LinkedHashSet<>();

        for(int nums:ar)
        {
        	unique.add(nums);
        }
        System.out.println(unique);
	}

}
