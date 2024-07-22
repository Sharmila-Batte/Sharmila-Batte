package com.collectionsexcercise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class ListToQueue {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(0);
		list.add(20);
		list.add(30);
		list.add(50);
		list.add(20);
		System.out.println(list);
		//Set<Integer> set=new HashSet<Integer>(list);
		Queue<Integer> q=new PriorityQueue<Integer>(list);
	
//		q.addAll(list);
//		list.removeAll(q);
		System.out.println(q);
	}

}
