package com.study4j.algotithms.easy;

/**
 * 27. Remove Element
 *
 *Given an array and a value, remove all instances of that value in-place and return the new length.
 *
 *Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 *The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 *
 */
public class RemoveElement {
	
	public static void main(String[] args) {
		
		int[] nums = {3, 2, 2, 6, 3, 3};
		System.out.println(removeElement(nums, 3));
		
	}

	public static int removeElement(int[] nums, int val) {
		
		int length = nums.length;
		int result = 0;
		for(int i = 0; i < length; i++) {
			if(val != nums[i]){
				nums[result++] = nums[i];
			}
		}
		return result;
	}

}
