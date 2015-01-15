package com.acc.rahul.practice;

public class EqualsTest {

	public static void main(String[] ars){
	
		Object a = new Object();
		EqualsTest b = new EqualsTest();
		b.equals(new EqualsTest());
		
	}

	public boolean equals(EqualsTest c){
		System.out.println("Overloaded method");
		return false;
	}
	/*
	EqualsTest(){
		super();
	}
	*/
	@Override
	public boolean equals(Object o){
		System.out.println("Overidden method");
		return true;
	}
	
	
}
