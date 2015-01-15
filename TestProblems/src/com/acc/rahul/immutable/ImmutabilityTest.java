package com.acc.rahul.immutable;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutabilityTest implements Cloneable {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws CloneNotSupportedException{
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);	list1.add(2); 	list1.add(3); 	list1.add(4);	list1.add(5);
		
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(11);set1.add(12);set1.add(13);set1.add(14);
		
		Map<Integer,String> map1 = new HashMap<Integer,String>();
		map1.put(10, "rahul");map1.put(20, "ketaki");map1.put(30, "prashant");
		
		Mutable mutable = new Mutable(1,"ashok");
		mutable.clone();
		
		Immutable immutable = new Immutable(0,1,"rahul",list1, set1,map1,mutable);
		System.out.println(immutable.getIntVal());
		System.out.println(immutable.getName());
		System.out.println(immutable.getIntegerVal());
		System.out.println(immutable.getList().size());
		System.out.println(immutable.getSet().size());
		System.out.println(immutable.getMap().size());
		System.out.println(immutable.getMutable().getId()+" "+immutable.getMutable().getName());
		immutable.getMutable().setId(4);
		System.out.println(immutable.getMutable().getId()+" "+immutable.getMutable().getName());

	    Immutable cloned = (Immutable) immutable.clone();
	    System.out.println(cloned.getIntVal());
		System.out.println(cloned.getName());
		System.out.println(cloned.getIntegerVal());
		System.out.println(cloned.getList().size());
		System.out.println(cloned.getSet().size());
		System.out.println(cloned.getMap().size());
		System.out.println(cloned.getMutable().getId()+" "+cloned.getMutable().getName());
		immutable.getMutable().setId(8);
		System.out.println(cloned.getMutable().getId()+" "+cloned.getMutable().getName());
		System.out.println(immutable.getMutable().getId()+" "+immutable.getMutable().getName());

	    System.out.println(cloned == immutable);
	    System.out.println(cloned.getClass()==immutable.getClass());
		System.out.println(cloned.equals(immutable));
		
	}

}
