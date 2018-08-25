package com.sandeep.person;

import java.util.HashMap;
import java.util.Map;

public class MapRevove {

	public static void main(String[] args) {
		Map<String, Person> map = new HashMap<>();
		
		Person person1=new Person(1, "Mahesh");
		Person person2 =new Person(2, "Ram");
		Person person3= new Person(3, "Krishna");
		
		map.put("1", person1) ;
		map.put("2", person2);
		map.put("3", person3);
		
		map.remove("1");
		System.out.println(map);
		
	map.remove("2", person3);
		System.out.println(map);
		
		map.remove("2", person2);
		System.out.println(map);
	}

}
