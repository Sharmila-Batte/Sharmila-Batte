package com.arrayexcercise;

public class SumOfElements {

	public static void main(String[] args) {
	int arr[]= {2,4,6,8,10};
	int sum=0;
	System.out.println("Array: ");
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
		sum=sum+arr[i];
	}
	System.out.println();

	System.out.println(sum);
	}
	
}
