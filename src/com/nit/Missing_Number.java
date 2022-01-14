package com.nit;

public class Missing_Number {

	public static void main(String[] args) {
		int a[]= {1,2,3,5,6};
		int x = 0;
		
		// Sum of Elements
		for(int i=0;i<a.length;i++) 
		{
			x=x+a[i];
			
		}
			System.out.println("Sum of Elements: "+x);
			
		// sum of range Elements
			int y=0;
			for(int i=1;i<=6;i++) 
			{
				y=y+i;
			}
			System.out.println("sum of range Elements: "+y);
	
			System.out.println("Missing Number is:- "+(y-x));
	}

}
