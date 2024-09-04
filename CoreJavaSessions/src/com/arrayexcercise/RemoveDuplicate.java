package com.arrayexcercise;

import java.util.Arrays;

public class RemoveDuplicate {
	static int removeDuplicate(int arr[]) {
		int rd = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[rd] != arr[i]) {
				rd++;
				arr[rd] = arr[i];

			}
		}
		return rd+1;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 3, 4, 5, 6, 4, 1 };
		Arrays.sort(arr);
		System.out.println("Original Array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		int rd=removeDuplicate(arr);
		System.out.println("Remove Duplicate: ");
		for (int i = 0; i < rd; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
