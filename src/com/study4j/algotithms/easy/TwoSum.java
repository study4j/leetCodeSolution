package com.study4j.algotithms.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {

		int[] nums = { 5, 2, 4 };
		int[] indiceNum = twoSum(nums, 6);
		System.out.println(indiceNum[0] + "," + indiceNum[1]);

	}

	public static int[] twoSum(int[] nums, int target) {

		Map<Integer, Integer> indiceMap = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			indiceMap.put(nums[i], i);
		}
		
		int[] indiceNum = new int[2];

		for (int i = 0; i < nums.length; i++) {
			if (indiceMap.containsKey(target - nums[i])) {
				if(i != indiceMap.get(target - nums[i])) {
					indiceNum = new int[] { i, indiceMap.get(target - nums[i]) };
					return indiceNum;
				}

			}
		}

		return indiceNum;

	}
}
