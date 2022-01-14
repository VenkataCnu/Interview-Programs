package com.nit;

public class MaxAndMinValue {

	public static void main(String[] args) {
		int a[]= {10,20,10,40,60,50};
		int max=a[0];
		
		// Max Number
		for(int i=1;i<a.length;i++) 
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
		
		// Min Number
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min) 
			{
				min=a[i];
			}
		}
		System.out.println(min);
		
	}

}
