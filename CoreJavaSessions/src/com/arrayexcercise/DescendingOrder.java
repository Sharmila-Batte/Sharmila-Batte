package com.arrayexcercise;

public class DescendingOrder {

	public static void main(String[] args) {
	int arr[]= {10,12,14,1,2,17};
	int temp=0;
	System.out.println("Original Array: ");
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[j]>arr[i])
			{
			 temp=arr[i];
			 arr[i]=arr[j];
			 arr[j]=temp;
			 }
		}
	}
	System.out.println("Descending Order: ");
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}

		
	}

}
