package Company_Questions;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Test1234 {
	    int x = 5;
	}
	
public class Main_Globant {

	
    public static void main(String[] args) {
        /*Test a = new Test();
        Test b = Test
        a = b;
        a.x = 100;
        System.out.println(b.x);//5*/
    	
    	
    	List<String> words = Arrays.asList("Java","JavaScript","Java");

    			List<String> duplicates = words.stream().collect(Collectors.groupingBy(c->c,Collectors.counting()))
    									  .entrySet().stream().filter(e->e.getValue()>1).map(e->e.getKey()).collect(Collectors.toList());
    			System.out.println("Duplicates are "+duplicates);

    }
}


/*final class Employee
{
	
	private final int id;
	private final String name;
	private final List<String> address;
	
	public Employee(int id,String name,List<String> address)
	{
		this.id = id;
		this.name = name;
		this.address= Collections.unmodifiableList(address);
	}
	
	
	 
}


Map<String,Integer> map = new HashMap<>();
map.put("ONE",1);
map.put(null,4);
map.put(null,null);

System.out.println(map.get("One")); 1
System.out.println(map.get("TWO")); 
System.out.println(map.get(null)); null



Can you find duplicates from a list of strings using Java 8?
;		*/
