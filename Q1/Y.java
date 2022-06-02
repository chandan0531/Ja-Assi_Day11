package com.Assi.Q1;

public interface Y {
	
	void funyAbstract();
	
	default void funyDefault() {
		System.out.println("Inside default in Y");
	}
	
	static void funyStatic() {
		System.out.println("Inside static in Y");
	}
}
