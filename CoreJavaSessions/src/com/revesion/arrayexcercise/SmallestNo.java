package com.revesion.arrayexcercise;

import java.util.Arrays;

public class SmallestNo {

	public static void main(String[] args) {
	int arr[]=new int[] {12,9,5,56,23};
	int min =arr[0];
	for(int i=1;i<arr.length;i++)
	{
		if(min>arr[i])
		{
			min=arr[i];
		}
	}
	System.out.println(min);
	}

}
