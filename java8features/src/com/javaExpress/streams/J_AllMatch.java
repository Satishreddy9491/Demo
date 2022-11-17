package com.javaExpress.streams;

import java.util.ArrayList;

public class J_AllMatch {
	public static void main(String[] args) {
		ArrayList<String> s = new ArrayList<String>();
		s.add("Java");
		s.add("python");
		s.add("aws");
		s.add("Php");
		s.add("C++");
		s.add("Kotlin");
		
		boolean result = s.stream().allMatch(a->a.contains("Java"));
		System.out.println(result);
		System.out.println();
		boolean result1 = s.stream().anyMatch(a->a.contains("Java"));
		System.out.println(result1);
		boolean result2 = s.stream().noneMatch(a->a.contains("Java"));
		System.out.println(result2);
		
		
	}
	
	public static boolean checkNumber(ArrayList<String>a) {
		for(String s:a) {
			if(s.contains("java")) {
				return true;
			}
			
		} 
		return false;
	}
}
