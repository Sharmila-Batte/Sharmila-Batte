package com.revesion.arrayexcercise;

public class SecondSmallestNo {

	public static void main(String[] args) {
		int arr[]=new int[] {1,2,3,4,5,6,14,10,-8};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(arr[arr.length-2]);

}
}