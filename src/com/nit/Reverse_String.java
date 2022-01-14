package com.nit;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {

		System.out.println("Enter the Name :-  ");
		Scanner sc = new Scanner(System.in);
		String a=sc.next();
		
		StringBuffer b = new StringBuffer(a);
		System.out.println(b.reverse());
		sc.close();
		
	}

}
