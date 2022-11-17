package com.javaExpress.functions;

import java.util.function.Function;


//Write a program to print all names from list of names using Function ?
//Real Time Examples : Comparator*/
public class A {
	public static void main(String[] args) {
		
		//Write a function to find length of given input string.
		
		Function<String,Integer> f=s ->s.length();
		System.out.println(f.apply("Satish reddy siddamurthi"));
		System.out.println(f.apply("Siddamurthi venkata Satish reddy"));
		
		
		// Program to remove spaces present in the given String by using Function
		
		Function<String ,String> f1=s->s.replaceAll(" ", "");
		System.out.println(f1.apply("sa t i s sh s  v"));
		System.out.println(f1.apply("re d d y s i d  d a m"));
		
		Function<String ,String> f2=s->s.toUpperCase();
		System.out.println(f2.apply("Satish reddy"));

	} 
	

}