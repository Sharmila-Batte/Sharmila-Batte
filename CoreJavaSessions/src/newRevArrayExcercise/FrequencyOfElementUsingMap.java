package newRevArrayExcercise;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElementUsingMap {
	public static void countFrequency(int arr[]) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		for(Map.Entry<Integer, Integer> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 3, 2, 2, 2, 3, 4, 5, 5 };
		countFrequency(arr);
		}
	}

//https://www.youtube.com/watch?v=TSq1rx4edXA&t=325s
