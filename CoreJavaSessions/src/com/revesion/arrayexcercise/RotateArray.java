package com.revesion.arrayexcercise;

public class RotateArray {
	//Reverse
	static void reverse(int arr[],int i,int j)
	{
		while(i<j)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
	
	//rotate
	public static void rotate(int arr[],int k)
	{
		k=k%arr.length;
		if(k<0)
		{
			k=k+arr.length;
		}
		reverse(arr,0,k-1);
		reverse(arr,k,arr.length-1);
		reverse(arr,0,arr.length-1);
	}
	
	public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	System.out.println("Array before rotate: ");
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	rotate(arr,3);
	System.out.println("Array after rotate: ");
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	
	}

}
//https://www.youtube.com/watch?v=oABQlhrhXzg&t=1029s