package Java8;
import java.util.*;
public class hashmapsss {
	
	 public static void main(String[] args) {
	        HashMap<Integer, String> map = new HashMap<>();

	        map.put(1, "First");  // Inserts null key with "First"
	        map.put(2, "Second"); // Overwrites with "Second"
	        map.put(1, "First");
	        for(Map.Entry e :map.entrySet())
	        {
	        	System.out.println(e.getKey()+" "+e.getValue());
	        }
	 }
}
