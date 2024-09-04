package com.collectionsexcercise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListUniqueElements {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(0);
		list.add(20);
		list.add(30);
		list.add(50);
		list.add(20);
		list.add(40);
		list.add(0);
		list.add(40);
	
		System.out.println("list elements are: "+list);
		Set<Integer> set=new HashSet<Integer>(list);
		System.out.println("unique elements: "+set);
		
	}

}
