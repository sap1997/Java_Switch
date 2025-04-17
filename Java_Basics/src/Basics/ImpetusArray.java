package Basics;

import java.util.ArrayList;
import java.util.List;

public class ImpetusArray {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("abc"); //list 1 = abc
		List<String> list2 = new ArrayList<>(); //list2 = abc
		/*String s1="abc";
		String s2="abc";
		String s3 = new String("abc");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		String s4="abc";
		System.out.println(s1==s4);*/
 System.out.println("Foo");
		foo(list1); 
		System.out.println("List1 : "+list1); //abc
		list2.add("abc");

		System.out.println("List2 : "+list2); //abc
		System.out.println("List1 and List2 equal: "+ (list1.equals(list2))); //false
	}
 
	public static void foo(List<String> list3) {
		System.out.println("List3 : "+list3); // abc
		list3 = new ArrayList<>();
		list3.add("def"); //def
		System.out.println("List3 updated: "+list3); //[abc,def]
	}
}
