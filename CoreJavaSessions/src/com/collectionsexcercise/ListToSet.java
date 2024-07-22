package com.collectionsexcercise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListToSet {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(60);
		list.add(60);
		list.add(30);
		list.add(40);
		System.out.println(list);
		Set<Integer> set=new HashSet<Integer>(list);
		System.out.println(set);
		
		

	}

}
