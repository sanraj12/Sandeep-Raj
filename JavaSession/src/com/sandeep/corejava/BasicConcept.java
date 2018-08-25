package com.sandeep.corejava;

public class BasicConcept {
	
	
	static int a=0;
	int b;
	 String abc=null ;
	

	public static void main(String[] args) {
		System.out.println("");
		
		int local1=0 ;
		int local2 =0;
		//System.out.println(BasicConcept.a);
		
		
		BasicConcept basicConcept = new BasicConcept();
		int d=basicConcept.sum(5, 6);
		System.out.println(d);

	}
	
	int sum(int a ,int b)
	{
		int c = a+b;
		
		return c;
	}

}


 