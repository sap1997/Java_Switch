package Basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class testing {
	  private final int id;
	    private final String name;
	    private final List<String> address;
	    
	    public testing(int id,String name,List<String>  address)
	    {
	    	this.id=id;
	    	this.name=name;
	    	this.address=new ArrayList<>(address);
	    }

		public int getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public List<String> getAddress() {
			return Collections.unmodifiableList(address);
		}
	    


}
