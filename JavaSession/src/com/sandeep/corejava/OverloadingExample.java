package com.sandeep.corejava;

public class OverloadingExample {

	public static void main(String[] args) {

		OverLoading loading = new OverLoading();
		OverLoading loading2 = new OverLoading();

		long area2 = loading.area(2, 3);
		long area3 = loading.area(2, 3, 4);
		
		long area5 = loading2.area(2, 3);
		long area4 = loading2.area(2, 3, 4);
		System.out.println(area2 + "   " + area2);

	}

}

class OverLoading {

	long area(int a, int b, int c) {
		long area = a * b * c;
		return area;
	}

	long area(int a, int b) {
		long area = a * b;
		return area;

	}

}