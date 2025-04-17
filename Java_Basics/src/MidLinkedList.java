/*Write a Java Program to Find Middle Element Of a LinkedList. 
Note: Create a Custom linkedList class, dont use predefined one*/
import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;
public class MidLinkedList {
	


public static void main(String args[])
{
	/*Node  n = new Node();
	n.data =5;
	n.data =6;
	n.data=7;
	
	//int size = n.length();*/


int ar[] = {2,4,4,2,1,3,5};
	Optional<Entry<Integer, Long>> result = Arrays.stream(ar).filter(n->n%2==0).boxed().collect(Collectors.groupingBy(n->n,Collectors.counting()))
			.entrySet().stream().max(Map.Entry.comparingByValue());
	System.out.println(result);
	
		
}
	
	
	
	
}
