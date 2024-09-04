package com.revesion.arrayexcercise;

import java.util.Arrays;

public class removeDuplicate {
	static int removeDuplicateElements(int arr[])
	{
		int rd=0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[rd]!=arr[i])
			{
				rd++;
				arr[rd]=arr[i];
			}
		}
		return rd+1;
	}

	public static void main(String[] args) {
		int arr[]= {1,2,4,2,3,2,4,5,6};
		Arrays.sort(arr);
		System.out.println("Array elements: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Duplicate elements are removed: ");
		int rd=removeDuplicateElements(arr);
		for(int i=0;i<rd;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
