package newRevArrayExcercise;

import java.util.Arrays;

public class RemoveDuplicate {
	public static int removeDup(int arr[])
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
		
		int arr[]= {10,13,4,5,7,6,5,13,10};
		System.out.println("Original Array is: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		Arrays.sort(arr);
		System.out.println("Array sorted elements are: ");
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
		System.out.println("");
		System.out.println("Array after removing duplicate elements are: ");
		int rd=removeDup(arr);
		for(int i=0;i<rd;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
	

	}

}
//.product-productMetaInfo :nth-child(3)