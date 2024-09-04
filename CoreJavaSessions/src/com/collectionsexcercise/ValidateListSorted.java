package com.collectionsexcercise;

import java.util.ArrayList;
import java.util.List;

import graphql.com.google.common.collect.Ordering;

public class ValidateListSorted {

	public static void main(String[] args) {
		List <Integer>list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		boolean sorted = Ordering.natural().isOrdered(list);
		System.out.println(sorted);

	}

}
