package com.revesion.arrayexcercise;

import java.util.Arrays;
import java.util.Collections;

public class SortingUsingInBuiltFun {

	public static void main(String[] args) {
		Integer arr[]=new Integer[] {19,11,5,8,34,2};
		System.out.println("Asc order");
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("Desc order");
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
	

	}

}
