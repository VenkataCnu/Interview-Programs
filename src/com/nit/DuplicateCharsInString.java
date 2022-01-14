package com.nit;

public class DuplicateCharsInString {

	public static void main(String[] args) {
		
		String str="Srimannarayana";
		@SuppressWarnings("unused")
		int count=0;
		char [] input = str.toCharArray();
		System.out.println("Duplicate Charecters are : ");
		
		for(int i=0; i<str.length();i++)
		{
			for (int j=i+1; j<str.length();j++)
			{
				if (input[i]==input[j])
				{
					System.out.println(input[j]);
					count++;
					break;
				}
				
			}
		}
	}

}
