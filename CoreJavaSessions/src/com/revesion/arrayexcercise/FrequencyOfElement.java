package com.revesion.arrayexcercise;

public class FrequencyOfElement {

	public static void main(String[] args) {
		int arr[]= {10,2,5,11,6,4,5,8,11,5,4,10,5,4};
		for(int i=0;i<arr.length;i++)
		{
			int frequency=arr[i];
			int count=0;
			if(frequency==-1)continue;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]==frequency)
				{
					count++;
					arr[j]=-1;
				}
			}
			System.out.println("Frequency of "+frequency+" is :"+count);
			
		}
		
	}
}	
	
	

