package newRevArrayExcercise;

import java.util.Arrays;

public class SecondLargest {
	public static void printLargest(int arr[])
	{
		
		int size=arr.length;
		if(size<2)
		{
			System.out.println("Invalid input...");
			return;
		}
		Arrays.sort(arr);
		for(int i=size-2;i>=0;i--)
		{
			if(arr[i]!=arr[size-1])
			{
				System.out.print(arr[i]+" ");
				return;
			}
			System.out.println("");
		}
		System.out.println("no largest element");
	}

	public static void main(String[] args) {
		int arr[]= {1,4,5,34,34,35,35};
		printLargest(arr);

	}

}
