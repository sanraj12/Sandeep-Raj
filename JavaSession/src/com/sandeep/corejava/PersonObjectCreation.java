package com.sandeep.corejava;

import com.sandeep.java.Person;

public class PersonObjectCreation extends Person{

public static void main(String[] args)
{
	
	//default or non-paramtrized
	Person person = new Person();
	person.setAge(23);
	person.setName("Brij");
	person.setSurname("Prasad");
	
	
	PersonObjectCreation creation = new PersonObjectCreation();
	
	String name = creation.name;
	

	String name1 = creation.getName();
	
	
	//parameterized
	Person person1 = new Person("Abhinay","Shrivastava",21);
	
	
	
	
	
	
	
}
	

}
