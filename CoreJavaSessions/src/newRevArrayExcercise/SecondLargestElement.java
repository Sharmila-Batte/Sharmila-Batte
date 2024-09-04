package newRevArrayExcercise;

import java.util.Arrays;

public class SecondLargestElement {

	public static void main(String[] args) {
		int arr[]= {2,8,5,12,40,56};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("Array is in asc order: "+Arrays.toString(arr));
		System.out.println(arr[arr.length-2]);

	}

}
