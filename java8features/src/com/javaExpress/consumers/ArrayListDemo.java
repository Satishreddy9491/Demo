package com.javaExpress.consumers;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<String> s=new ArrayList<>();
		s.add("Satish");
		s.add("reddy");
		s.add("Sirisha");
		s.add("Jagan");
		System.out.println(s);
		
		s.forEach(a->System.out.println(a));
	}
	
}
