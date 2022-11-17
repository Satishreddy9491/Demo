package com.javaExpress.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class N_FinalExample {
	public static void main(String[] args) {
		List<HdfcBank> li=new ArrayList<>();
		li.add(new HdfcBank("satish", 5678,9088780));
		li.add(new HdfcBank("reddy", 98765,9870));
		li.add(new HdfcBank("sidda", 123,343200));
		li.add(new HdfcBank("murthi", 9876,343289));
		
		List<String> result = li.stream().
		filter(bank -> bank.getBalance()>8000)
		.map(HdfcBank::getName)
		.map(String::toUpperCase)
		.distinct()
		.limit(2)
		.collect(Collectors.toList());
		
		System.out.println(result);
	}
}
