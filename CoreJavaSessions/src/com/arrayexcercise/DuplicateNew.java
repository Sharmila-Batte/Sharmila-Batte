package com.arrayexcercise;

import java.util.Arrays;

public class DuplicateNew {
	static void removeDuplicate(int arr[]) {
		int rd = 0;
		for (int i = 1; i < arr.length; i++) {
			if(arr[rd] == arr[i])
			{
				System.out.println(arr[rd]);
				
			}
			
		
		}
		
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 3, 4, 5, 6, 4, 1 };
		Arrays.sort(arr);
		System.out.println("Original Array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		removeDuplicate(arr);
		System.out.println("Remove Duplicate: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
