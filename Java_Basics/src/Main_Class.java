/*
 * Create a list of Person objects having duplicate IDs and names in different cases
 *  (e.g., “Rahul” vs “rahul”). Implement case-insensitive equality logic using overridden equals() and 
 *  hashCode(), then filter unique records.
 */

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main_Class {
	public static void main(String args[])
	{
		List<Person> persons = Arrays.asList(new Person(1,"Rahul"),
											new Person(1,"rahul"));
		
		
		Set<Person> result = persons.stream().distinct().collect(Collectors.toSet());
		
		System.out.println(result.size());
	}

}
