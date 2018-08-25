package com.sandeep.person;

public class Person {
	private Integer pid;
	private String name;
	
	
	public Person() {}
	public Person(int pid, String name){
		this.pid = pid;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + "]";
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
} 
