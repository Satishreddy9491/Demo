package com.javaExpress.assignments;

import java.util.Random;
import java.util.stream.Stream;

public class RandomNumbers {
	public static void main(String[] args) {
		Stream
		.generate(() -> (new Random()).nextInt(10))
		.limit(4)
		.forEach(System.out::println);
		
					}
}
