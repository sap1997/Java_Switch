package Company_Questions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
 
public class Qatar {
    public static void main(String[] args) {
    	EmployeeClass e1 = new EmployeeClass("e1", List.of(new Address("BLR"),new Address("BOM")));
    	EmployeeClass e2 = new EmployeeClass("e2", List.of(new Address("BOM"),new Address("HYD")));
    	EmployeeClass e3 = new EmployeeClass("e3", List.of(new Address("HYD"),new Address("CHN")));
    	
    	Set<String> uniquecity = new HashSet<>();
    	
    	List<EmployeeClass> empList = List.of(e1, e2, e3);
 
        List<EmployeeClass> empinbom = new ArrayList<>();
        
      for(EmployeeClass e : empList)
      {
    	  for(Address address : e.getAddressList())
    	  {
    		  if(address.getCityName().equalsIgnoreCase("BOM"));
{
	empinbom.add(e);
	break;
}
    	  }


for(Address addrs : e.getAddressList())
{
	uniquecity.add(addrs.getCityName());
}


 empList.stream().filter(emp->emp.getAddressList().stream()
		.anyMatch(add->add.getCityName().equalsIgnoreCase("BOM"))).forEach(System.out.println(e->e.));;;
							




    	  }
    	  
      }
   
      
      
        
        
 
        
    }
}