package com.javaExpress.consumers;

import java.util.HashMap;
import java.util.List;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> h=new HashMap<>();
		h.put(1, "satish");
		h.put(2, "reddy");
		h.put(3, "Sidda");
		h.put(4, "murthi");
		System.out.println(h);
		
		h.forEach((s,b)->System.out.println(s+" "+b));
	}
}
