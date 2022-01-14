package com.nit;

import java.util.Scanner;

public class SwapNum {

	public static void main(String[] args) {
		
		int x,y,z;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter x value: ");
		x=sc.nextInt();
		System.out.println("Enter y value: ");
		y=sc.nextInt();
		z=x+y;
		x=z-x;
		y=z-y;
		System.out.println("Value of x is :"+x);
		System.out.println("Value of y is :"+y);
	
		sc.close();
	}

}
