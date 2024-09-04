package com.stringexcercise;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharCount {

	public static void main(String[] args) {
		String str = "Sharmila Srushti aa";
		char chArr[] = str.toCharArray();
		Map<Character, Integer> dupMap = new HashMap<>();
		for (char keys : chArr) {
			//count only if keys contains only alphabets
			if (Character.isAlphabetic(keys)) {
				
				if (dupMap.containsKey(keys)) {
					dupMap.put(keys, dupMap.get(keys) + 1);
				} else {
					dupMap.put(keys, 1);

				}
			}
		}
		dupMap.entrySet().removeIf(i->i.getValue()==1);
		System.out.println(dupMap);
	}

}
//https://www.youtube.com/watch?v=YdIcoNJY7wo