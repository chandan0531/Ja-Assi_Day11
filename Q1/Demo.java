package com.Assi.Q1;

public class Demo {
	
	public static void main(String[] args) {
		
		Z zJava = new ZImpl();
		zJava.funxAbstract();
		zJava.funxDefault();
		
		zJava.funyAbstract();
		zJava.funyDefault();
		
		zJava.funzAbstract();
		
		
		Y yjaza=(Y)zJava;
		Y.funyStatic();
		
		X xJava = (X)yjaza;
		X.funxStatic();
	}
}
