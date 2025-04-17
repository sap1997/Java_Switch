package Basics;

import java.util.HashMap;

public class xecpes {
	public static void main(String args[])
	{
		class Employee {
			public Employee(int i, String string) {
				// TODO Auto-generated constructor stub
			}
			int id;
			String name;
			public String getName() {
				// TODO Auto-generated method stub
				return null;
			}
			}
			 
			Employee e1 = new Employee(1,"ABC1");
			Employee e2 = new Employee(2,"ABC");
			Employee e3 = new Employee(1,"ABC1");
			Employee e4 = new Employee(4,"ABC3");
			Employee e5 = new Employee(5,"ABC4");
			 
			 
			HashMap<Employee, String> map = new HashMap();
			map.put(e1, e1.getName());
			map.put(e2, e2.getName());
			map.put(e3, e3.getName());
			map.put(e4, e4.getName());
			map.put(e5, e5.getName());
			System.out.println(map.size());
			System.out.println(getValue());
	}
	public static int getValue() {
	    try {
	        int a =1/0;
	    } catch (Exception e) {
	        return 4;
	    } finally {
	        return 5; // This will always execute and override return 4
	    }
	}


}
