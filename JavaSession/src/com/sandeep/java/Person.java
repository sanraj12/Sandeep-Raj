package com.sandeep.java;

 public class Person {

	
    public String name ;
    String surname;
    int age;
    
    
    public Person()
    {
    	
    }
    
    public Person(String name, String surname, int age)
    {
    	this.name=name; 
    	this.surname= surname;
    	this.age=age;
    }
    
	protected  String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


}
