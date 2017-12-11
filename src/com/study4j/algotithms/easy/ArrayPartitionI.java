package com.study4j.algotithms.easy;

import java.util.Arrays;

/**
 * 561
 * Given an array of 2n integers, your task is to group these integers into n pairs of integer, 
 * say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
 */
public class ArrayPartitionI {

	public static void main(String[] args) {
		int[] nums = {1, 1, 2, 2};
		int result = arrayPairSum(nums);
		System.out.println(result);
	}
	
	public static int arrayPairSum(int[] nums) {
		Arrays.sort(nums);
		int sum = 0;
		int length = nums.length;
		for(int i = 0; i < length; i = i + 2){
			sum += nums[i] > nums[i+1] ? nums[i+1] : nums[i];
		}
		return sum;
	}
	
}
