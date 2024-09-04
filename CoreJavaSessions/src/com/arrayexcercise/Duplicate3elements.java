package com.arrayexcercise;

public class Duplicate3elements {


	public static void main(String[] args) {
		int arr[] = { 1, 2,2, 3, 4, 2, 3 };
		System.out.println("Array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[i] + " ");
				}

			}
		}

}
}
