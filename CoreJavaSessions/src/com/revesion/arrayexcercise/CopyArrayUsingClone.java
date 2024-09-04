package com.revesion.arrayexcercise;

public class CopyArrayUsingClone {
	public static void main(String[] args) {
		int arr1[]= {1,4,5,6,3,2};
		System.out.println("1st Array: ");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println(" ");
		
		System.out.println("2nd Array: ");
		int arr2[]=arr1.clone();
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+" ");
		}
		
	}
	

}
