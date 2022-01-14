package com.nit;

public class ReverseNumber {
	
	public static void rev(int number)
	{
		if(number<10) {
			System.out.println(number);
			return;
		}
		else
		{
			System.out.print(number%10);
			rev(number/10);
			
		}
	}
	
	public static void main(String[] args) {
		rev(56789);
		
		int b=123456;
		while(b>0) {
		
		int num=b%10;
		System.out.print(num);
		b=b/10;
		}
	}

}
