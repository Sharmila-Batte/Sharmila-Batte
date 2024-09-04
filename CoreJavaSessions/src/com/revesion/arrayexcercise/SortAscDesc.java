package com.revesion.arrayexcercise;

public class SortAscDesc {

	public static void main(String[] args) {
		int arr[]= {1,4,8,6,0,12};
		//asc
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		//desc
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int a:arr)
		{
			System.out.print(a+" ");
		}


	}

}
