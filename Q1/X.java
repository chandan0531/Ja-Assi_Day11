package com.Assi.Q1;

public interface X {
	
	void funxAbstract();
	
	default void funxDefault() {
		System.out.println("Inside default in X");
	}
	
	static void funxStatic() {
		System.out.println("Inside static in X");
	}
}
