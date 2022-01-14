package com.nit;

import java.util.Arrays;
import java.util.stream.Stream;

public class JoinTwoArrays {

	public static void main(String[] args) {

		
		// using Java 8 Feature
		System.out.println("JAVA * Feature");
		String tolly[] = {"Pawan","Mahesh", "Prabhas", "Jr. NTR", "Nani", "Manoj"};
		
		String kolly[]= {"Rajini","Kamal","Vijay", "Ajith","Surya", "Madhavan"};

		Stream<String> teh = Arrays.stream(tolly);				
		Stream<String> tah = Arrays.stream(kolly);
		
		String[] alh = Stream.concat(teh, tah).toArray(Size -> new String [Size]);
		
		for (String h:alh) 
		{
			System.out.println(h);
		}
		System.out.println("------------------------------------------------------");
		
		
		
		
	}

}
