package com.javaExpress.predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class C_Country {
	public static void main(String[] args) {
		
		List<Country> c=new ArrayList<>();
		c.add(new Country("india", 12345));
		c.add(new Country("japan", 12345));
		c.add(new Country("america", 12345));
		c.add(new Country("rashya", 12345));
		c.add(new Country("indonesia", 12345));
		
		Predicate<Country> cc=ss ->ss.getName().startsWith( "i");
		for(Country p:c) {
			if(cc.test(p)) {
				System.out.println(p);
			}
		}
	}
}
