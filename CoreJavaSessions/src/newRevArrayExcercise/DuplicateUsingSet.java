package newRevArrayExcercise;

import java.util.HashSet;
import java.util.Set;

public class DuplicateUsingSet {

	public static void main(String[] args) {
		int arr[]= {1,1,1,2,5,3,2,2,4};
		Set<Integer> uSet=new HashSet<>();
		Set<Integer> dSet=new HashSet<>();
		for(int i=0;i<arr.length;i++)
		{
			if(!uSet.add(arr[i]))
			{
				dSet.add(arr[i]);
			}
		}
		System.out.println(dSet);
		//System.out.println(uSet);
	}
}
