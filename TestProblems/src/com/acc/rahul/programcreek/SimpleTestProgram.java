package com.acc.rahul.programcreek;

import java.util.ArrayList;
import java.util.List;

public class SimpleTestProgram {

	public static void main(String[] args) {
List<String> l = new ArrayList<String>();
add(l,1);
String s = (String) l.get(0); 
	}

	public static void add(List<String> list, Object o){
		list.add((String) o);
	}
}
