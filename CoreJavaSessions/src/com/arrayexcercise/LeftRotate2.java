package com.arrayexcercise;

public class LeftRotate2 {
	static void reverse(int arr[], int i, int j) {
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

	static void rotate(int arr[], int k) {
		// if k =>size of the array
		k = k % arr.length;
		// if k is negative for eg. -1,-2 etc
		if (k < 0) {
			k = k + arr.length;

		}
		reverse(arr,0,k-1);
		reverse(arr,k,arr.length-1);
		reverse(arr,0,arr.length-1);

	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		System.out.println("Array before rotate:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		rotate(arr,4);
		System.out.println("Array after rotate:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
