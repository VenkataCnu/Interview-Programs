package com.nit;

public class WithoutLengthMethod {

	public static void main(String[] args) {

		String name = "My Name is Srinivas";
		int f=name.lastIndexOf("");
		System.out.println("Number of charecters are "+f);
		
		char [] ab = name.toCharArray();
		System.out.println("Number of charecters are   "+ab.length);
	
		int count = 0;
		for(char e:name.toCharArray())
		{
			count++;
		}
		System.out.println(count);
	}

}
