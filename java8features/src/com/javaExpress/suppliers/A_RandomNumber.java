package com.javaExpress.suppliers;


//How to generate Random Number using Suppliers?✓


import java.util.Random;
import java.util.function.Supplier;

public class A_RandomNumber {
	public static void main(String[] args) {
		Supplier<String> s=()->"satish";
		System.out.println(s.get());
		
		Supplier<Integer> s1=()->new Random().nextInt(1000);
		for(int i=0;i<6;i++) {
			System.out.println(s1.get());
		}	
	}
}
