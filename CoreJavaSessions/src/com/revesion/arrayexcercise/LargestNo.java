package com.revesion.arrayexcercise;

public class LargestNo {

	public static void main(String[] args) {
		int arr[]= {1,9,4,18,34,45};
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println(max);
	}
	
}
