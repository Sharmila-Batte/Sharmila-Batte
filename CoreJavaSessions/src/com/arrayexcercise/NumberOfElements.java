package com.arrayexcercise;

public class NumberOfElements {

	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
			count++;
		}
		System.out.println();
		
		System.out.println("Number of elements in an array: "+count);
	}

}
