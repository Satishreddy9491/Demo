package com.javaExpress.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class H_streams {
	public static void main(String[] args) {
		Integer[] a= {1,2,4,5,7,8,6,3};
		
		Stream<Integer> result =Stream.of(a);
//		result.forEach(n->System.out.println(n));
		
//		method reference
		
		result.forEach(System.out::println);
		
	}
}
