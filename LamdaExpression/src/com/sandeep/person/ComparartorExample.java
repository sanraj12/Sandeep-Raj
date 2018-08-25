package com.sandeep.person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparartorExample {
	
	public static void main(String[] args)
	{
		Comparator<Person> comparator = new Comparator<Person>() {
			
			@Override
			public int compare(Person o1, Person o2) {
				
			int name=	o1.getName().compareTo(o2.getName());
			return name==0?o1.getPid().compareTo(o2.getPid()):name;
				
			}
		};
		
        List<Person> list = new ArrayList<>();    	
list.add(new Person(1, "Mahesh"));
list.add(new Person(4, "Mahesh"));
list.add(new Person(2, "Ram"));
list.add(new Person(3, "Krishna")); 
list.sort(comparator);
System.out.println(list);

	}

}
