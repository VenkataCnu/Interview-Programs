
package com.nit;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter The Number");
	int num, fact=1;
	num=sc.nextInt();
	for(int i=1;i<=num;i++) 
	{
		fact=fact*i;
		
	}	
		System.out.println("The Factorial of"+" "+num+" "+"is"+" "+fact);
		sc.close();
	
	
	}

}
