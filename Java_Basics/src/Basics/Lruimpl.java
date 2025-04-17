package Basics;

public class Lruimpl {
	public static void main(String args[])
	{
		Altrimetrik<Integer,String> al = new Altrimetrik<>(3);
		al.put(2, "A");
		al.put(3, "B");
		al.put(4,"C");
		al.printCache();
	
		
		al.get(2);
		al.put(5, "D");
		al.printCache();
	}

}
