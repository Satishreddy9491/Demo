package com.javaExpress.assignments;

import java.util.stream.Stream;

public class InfinateSeriesUsingStream {
	public static void main(String[] args) {
//		Stream.iterate(1, num -> num+2)
//		.forEach(System.out::println);
		
		Stream.iterate(0, num -> num+1)
		.filter(i -> i%2==0)
		.limit(7)
		.forEach(System.out::println);
	}
}
