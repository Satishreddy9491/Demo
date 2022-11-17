package com.javaExpress.streams;

import java.util.ArrayList;

public class G_MinmimNumber {
	public static void main(String[] args) {
		ArrayList<Integer>a=new ArrayList<>();
		a.add(54);
		a.add(12);
		a.add(234);
		a.add(89);
		
		Integer result = a.stream().min((s1,s2)->s1.compareTo(s2)).get();
		System.out.println("Minimum number = "+ result);
		

		Integer result1 = a.stream().max((s1,s2)->s1.compareTo(s2)).get();
		System.out.println("Minimum number = "+ result1);
	
	}
}
