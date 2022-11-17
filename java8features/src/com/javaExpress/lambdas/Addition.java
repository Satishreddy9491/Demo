package com.javaExpress.lambdas;

@FunctionalInterface 
//inside the interface you can define only one abstract method and any number of default methods and static method is known as functional interface

interface IAdd{
	void add(int a, int b);
}

public class Addition {
	public static void main(String[] args) {
		
		IAdd obj=(int a,int b)->{
			System.out.println(a+b);
		};
		obj.add(12,13);
		
		IAdd obj1=(a,b)->{
			System.out.println(a+b);
		};
		obj1.add(78,12);
		
		IAdd obj2=(a,b)->System.out.println(a+b);
		
		obj2.add(13, 13);
	}

}
