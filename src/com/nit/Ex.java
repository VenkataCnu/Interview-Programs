package com.nit;

public class Ex {

	public static void main(String[] args) {
	
		int x,y,count=5;
		for(x=0;x<count;x++) 
		{
			for(y=count-x;y>1;y--) 
			{
				System.out.print(" ");
			}
			
			for(y=0;y<=x;y++) 
			{
				System.out.print("*");
			}
			
			System.out.println();
			
			
		}
		
		
	}

}
