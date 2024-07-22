package com.arrayexcercise;

public class FrequencyElement {

	public static void main(String[] args) {
		int arr[] = { 10,10,11,12,13,14,15,10,10,12};
		
		for (int i = 0; i <arr.length; i++) {
			int frequency = arr[i];
			int count = 0;
			if(frequency==-1)continue;
			for (int j =0; j <arr.length; j++) {
				if (arr[j]==frequency) {
					// System.out.println(arr[i]);
					count++;
					arr[j]=-1;
					}
				}
			System.out.println(frequency + " " + count);
		}
		// System.out.println(+count);
	}

}
