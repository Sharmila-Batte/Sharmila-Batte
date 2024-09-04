package com.revesion.arrayexcercise;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElementUsingMap {
	public static void count(int arr[])
	{
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i], map.get(arr[i])+1);
			}
			else
			{
				map.put(arr[i], 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

	public static void main(String[] args) {
		int arr[]= {2,5,3,2,2,5,4};
		count(arr);

	}

}
