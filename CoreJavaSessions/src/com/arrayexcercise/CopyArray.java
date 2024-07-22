package com.arrayexcercise;

public class CopyArray {

	public static void main(String[] args)
	{
	  int arr1[]=new int[] {2,4,6,8,10};
	  int arr2[]=new int[arr1.length];
	  //First Array
	  System.out.println("First Array:");
	  for(int i=0;i<arr1.length;i++)
	  {
		  System.out.print(arr1[i]+" ");
	  }
	  
	   System.out.println("");
	  
	  //copy elements of 1st array into second array
	  for(int i=0;i<arr1.length;i++)
	  {
		  arr2[i]=arr1[i];
	  }
	  //Second array
	  System.out.println("Second Array:");
	  for(int i=0;i<arr2.length;i++)
	  {
		 System.out.print(arr2[i]+" ");
	  }
		
		

	}

}
