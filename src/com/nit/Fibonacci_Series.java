package com.nit;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a, b, c, count;
		a=0; b=1;
		System.out.println("Enter the Count :- ");
		count=sc.nextInt();
		
		System.out.print(a+" "+b);
		for (int i=0;i<count;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	sc.close();	
	}

}
