package com.nit;

import java.util.Scanner;

public class PrimeNumber
{
   public static void main(String[] args)
   {
	   int num, count=0;
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter A Number :");
	   num = sc.nextInt();
	   
	   for(int i=2;i<num;)
	   {
		   if (num%i==0)
			   count ++;
		   	   break;
	   }
	   
	 if (count==0) 
		 System.out.println("It is a Prime Number");
	 else
		 System.out.println("Not A Prime Number");
	 sc.close();
}
   }