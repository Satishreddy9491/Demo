package javaExpress.Inheritencedemo;

public interface Right {
	default void m1() {
		System.out.println("Right m1");
	}
}
