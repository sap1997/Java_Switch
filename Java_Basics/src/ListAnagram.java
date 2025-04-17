import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListAnagram {
	
	 public static void main(String[] args) {
	        String s = "thequickbrownfoxpsoverthelazydog";
	        Set<Character> res = new HashSet<>();
	        for(char ch : s.toCharArray())
	        {
	        	res.add(ch);
	        }
	        if(res.size()==26)
	        {
	        	System.out.println("panagram");
	        }
	        else
	        {
	        	System.out.println("Non Panagram");
	        }
	        
	    }



}
