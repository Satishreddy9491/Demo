package com.javaExpress.predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//Write a predicate to print  all numbers whose number is greater than 10j
public class B_Numbers {
	public static void main(String[] args) {
		
		List<Integer> l=new ArrayList<>();
		l.add(87);
		l.add(2);
		l.add(67);
		l.add(1);
		l.add(4);
		
		Predicate<Integer> p=in -> in>10;
		
		for(Integer i:l) {
			if(p.test(i)) {
				System.out.println(i);
			}
		}
	}
}
