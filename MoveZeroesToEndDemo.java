package com.code;

import java.util.Arrays;

public class MoveZeroesToEndDemo {

	public static void moveZeros(int[] nums) {
		int i = 0; 
		int j = 0;

		// Iterate through the array
		while (i < nums.length) {
			if (nums[i] != 0) {
				nums[j] = nums[i];
				j++;
			}
			i++;
		}
		while (j < nums.length) {
			nums[j] = 0;
			j++;
		}
	}

	public static void main(String[] args) {
		int[] nums = { 0, 1, 0, 3, 12 };
		System.out.println("Original Array: " + Arrays.toString(nums));

		moveZeros(nums);

		System.out.println("Modified Array: " + Arrays.toString(nums));
	}
}
