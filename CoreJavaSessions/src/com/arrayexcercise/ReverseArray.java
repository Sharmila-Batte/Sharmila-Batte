package com.arrayexcercise;

public class ReverseArray {
	static void reverse(int a[]) {
		int i=0,j=a.length-1;
		while(i<j)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}

	}

	public static void main(String[] args) {
		int arr[]= {1,2,4,5,6};
		System.out.println("Array before Reverse");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		reverse(arr);
		System.out.println("Array after Reverse");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
			
			

	}

}
