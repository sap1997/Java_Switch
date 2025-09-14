package Company_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Perennial {
	//Employee:- name,age,gender
	//oldest male and female employee
	
	public static void main(String args[])
	{
		List<Employ> input = Arrays.asList(
							new Employ("Rohan","M",25),
							new Employ("Mita","F",30),
							new Employ("Rohit","M",28),
							new Employ("Rina","F",29));
		
		
		 Optional<Employ> male;
		 Optional<Employ> female;
		 
		 male = input.stream().filter(e->e.getGender()=="M").sorted(Comparator.comparingInt(Employ::getAge).reversed()).findFirst();
		 female =input.stream().filter(e->e.getGender()=="F").sorted(Comparator.comparingInt(Employ::getAge).reversed()).findFirst();

		 if(male.isPresent())
		 {
			 System.out.println(male.get());
		 
		 }
		

		if(female.isPresent())
		{
			System.out.println(female.get());
		}
		
	Map<String, Optional<Employ>> getsalbygen = input.stream().collect(Collectors.groupingBy(Employ::getGender,Collectors.maxBy(Comparator.comparing(Employ::getAge))));
	 getsalbygen.forEach((gender, empOpt) -> {
         empOpt.ifPresent(emp -> {
             System.out.println("Gender: " + gender + 
                                ", Name: " + emp.getName() + 
                                ", Age: " + emp.getAge());
         });
     });
	}

}
