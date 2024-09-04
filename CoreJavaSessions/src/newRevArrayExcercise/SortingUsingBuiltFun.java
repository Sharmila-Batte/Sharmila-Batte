package newRevArrayExcercise;

import java.util.Arrays;
import java.util.Collections;

public class SortingUsingBuiltFun {

	public static void main(String[] args) {
		Integer arr[]= {18,10,45,7,2,9};
		System.out.println("Array elements are: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		Arrays.sort(arr);
		System.out.println("Asc order: "+Arrays.toString(arr));
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println("Desc order: "+Arrays.toString(arr));

	}

}
