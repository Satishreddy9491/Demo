package com.javaExpress.assignments;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Max_AND_min {
	public static void main(String[] args) {
		List<HdfcBank> li=new ArrayList<>();
		li.add(new HdfcBank("Satish", 5678,9000));
		li.add(new HdfcBank("Reddy", 98765,870));
		li.add(new HdfcBank("Sidda", 123,879));
		li.add(new HdfcBank("murthi", 9876,980));
		
		HdfcBank result = li.stream().min(Comparator.comparing(HdfcBank::getBalance)).get();
		System.out.println(result);
		
		HdfcBank result1 = li.stream().max(Comparator.comparing(HdfcBank::getBalance)).get();
		System.out.println(result1);
		
		
		HdfcBank result2 = li.stream().min(Comparator.comparing(HdfcBank::getAccountNo)).get();
		System.out.println(result2);
		
	}
}
