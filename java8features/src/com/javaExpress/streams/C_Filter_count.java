package com.javaExpress.streams;
import java.util.ArrayList;

public class C_Filter_count {
	public static void main(String[] args) {
		ArrayList<String>s=new ArrayList<>();
		s.add("Java");
		s.add("python");
		s.add("aws");
		s.add("Php");
		s.add("c++");
		
		long result = s.stream().filter(a->a.length()==3).count();
		System.out.println(result);
		
	}
}
