package com.code;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {

	public static int firstUniqChar(String s) {
		Map<Character, Integer> charCount = new HashMap<>();
		
		// Count the occurrences of each character in the string
		for (char c : s.toCharArray()) {
			charCount.put(c, charCount.getOrDefault(c, 0) + 1);
		}

		// Find the first character with a count of 1
		for (int i = 0; i < s.length(); i++) {
			if (charCount.get(s.charAt(i)) == 1) {
				return i;
			}
		}
		// If no unique character is found, return -1
		return -1;
	}

	public static void main(String[] args) {
		String s = "loveleetcode";
		int index = firstUniqChar(s);
		System.out.println("First unique character index: " + index);
	}
}
