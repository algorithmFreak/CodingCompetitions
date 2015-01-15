package com.acc.rahul.immutable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class Immutable implements Cloneable {

	private final int intVal;

	private final Integer integerVal;

	private final String name;

	private final List<Integer> list;

	private final Set<Integer> set;

	private final Map<Integer, String> map;

	private final Mutable mutable;

	/**
	 * @param intVal
	 * @param integerVal
	 * @param list
	 * @param set
	 * @param map
	 */
	public Immutable(int intVal, Integer integerVal, String name,
			List<Integer> list, Set<Integer> set, Map<Integer, String> map,
			Mutable mutable) {
		super();
		this.intVal = intVal;
		this.integerVal = integerVal;
		this.name = name;
		/*this.list = Collections.unmodifiableList(list);
		this.set = Collections.unmodifiableSet(set);
		this.map = Collections.unmodifiableMap(map);*/ 
		
		//OR
		
		this.list=list;
		this.set=set;
		this.map=map;
		this.mutable = mutable;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the intVal
	 */
	public int getIntVal() {
		return intVal;
	}

	/**
	 * @return the integerVal
	 */
	public Integer getIntegerVal() {
		return integerVal;
	}

	/**
	 * @return the list
	 */
	public List<Integer> getList() {
		return new ArrayList<Integer>(list);
	}

	/**
	 * @return the set
	 */
	public Set<Integer> getSet() {
		return new HashSet<Integer>(set);
	}

	/**
	 * @return the map
	 */
	public Map<Integer, String> getMap() {
		return new HashMap<Integer,String>(map);
	}

	/**
	 * @return the mutable
	 * @throws CloneNotSupportedException 
	 */
	public Mutable getMutable() throws CloneNotSupportedException { 
		return (Mutable) mutable.clone();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Integer.valueOf(5);
		String.valueOf(new Mutable(1,"d"));
		return super.clone();
	}

}
