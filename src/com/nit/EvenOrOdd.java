package com.nit;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		System.out.println("Please Enter a Number :-  ");
		int num ;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if(num%2==0)
		
			System.out.println("Even Number");
		else
			System.out.println("Odd Number");
		sc.close();
		
	}

}
