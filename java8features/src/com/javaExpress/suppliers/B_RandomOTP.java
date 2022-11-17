package com.javaExpress.suppliers;

import java.util.Random;
import java.util.function.Supplier;

public class B_RandomOTP {
	public static void main(String[] args) {
		Supplier<String> s=()->{
			String otp="Satish-";
			for(int i=0;i<6;i++) {
				otp=otp+new Random().nextInt(10);
			}
			return otp;
		};
		for(int i=0;i<6;i++) {
		System.out.println(s.get());
		}
	}
}
