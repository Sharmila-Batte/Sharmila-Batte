package com.arrayexcercise;

public class LeftRotate1 {
	static void rotateOne(int arr[]) {
		int temp=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=temp;

	}
	static void rotate(int arr[],int k)
	{
		//if k =>size of the array
		k=k%arr.length;
		// if k is negative for eg. -1,-2 etc
		if(k<0)
		{
			k=k+arr.length;
			
		}
		for(int i=1;i<=k;i++)
		{
			rotateOne(arr);
		}
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		System.out.println("Array before Rotate:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
		rotate(arr,-1);
		System.out.println("Array after Rotate:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}

	}
}