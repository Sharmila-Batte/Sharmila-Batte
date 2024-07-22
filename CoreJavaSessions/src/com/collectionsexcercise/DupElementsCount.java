package com.collectionsexcercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DupElementsCount {

public static void main(String[] args) {
//		
//		List<Integer> list=new ArrayList<Integer>();
//		list.add(10);
//		list.add(20);
//		list.add(0);
//		list.add(20);
//		list.add(30);
//		list.add(50);
//		list.add(60);
//		list.add(40);
//		list.add(0);
//		list.add(40);
//		
//		System.out.println("list elements are: "+list);
//		Set<Integer> set=new HashSet<Integer>();
//		
//		for(int no :list)
//		{
//			if(set.add(no)==false)
//			System.out.println(no);
//		}
		
	//}

	ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(10);
	list.add(20);
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(50);
	list.add(20);
	list.add(50);
	list.add(20);
	Set<Integer> uset=new HashSet<>();
	Set<Integer> dset=new HashSet<>();
	
	for(int val:list)
	{
		if(!uset.add(val)) {
			dset.add(val);
			
		}
		
	}
	Iterator<Integer> itr=dset.iterator();
	for(int i=0;i<dset.size();i++) {
		int no=itr.next();
		System.out.print(no +": ");
		System.out.println(Collections.frequency(list, no));
	}
	
	//System.out.println("list elements are: "+dset);

	
	
	
	
	
	
	
}
	
}
