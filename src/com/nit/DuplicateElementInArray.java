package com.nit;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		
		String [] names = {"Ram","Krishna","Bheem","Arjun","Ram","Karna","Krishna","Bheem"};
		
		
		// Brut method
		
		for(int i=0;i<names.length;i++)
		{
			for(int j=i+1;j<names.length;j++)
			{
				if(names[i].equals(names[j]))
				{
					System.out.println(names[i]);
				}
			}
		}
		
		
		
		// Hast set Method
		
		Set<String> nam = new HashSet<String>();
		for(String e:names)
		{
			if(nam.add(e)==false)
			{
				System.out.println(e);
			}
		}
		
		
		
		
	}

}
