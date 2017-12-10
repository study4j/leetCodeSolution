package com.study4j.algotithms.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 728
 * A self-dividing number is a number that is divisible by every digit it contains.
 * 
 * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
 * 
 * Also, a self-dividing number is not allowed to contain the digit zero.
 * 
 * Given a lower and upper number bound, output a list of every possible self dividing number, 
 * including the bounds if possible.
 *
 */
public class SelfDividingNumbers {

	public static void main(String args[]) {
		int left = 1;
		int right = 22;
		List<Integer> result = selfDividingNumbers(left, right);
		System.out.println(result);
		
	}
	
	public static List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> result = new ArrayList<Integer>();
		
		for(int i = left; i <= right; i++) {
			if(canAdd(i)) {
				result.add(i);
			}
		}
		
		return result;
	}
	
	private static boolean canAdd(int i) {
		String numStr = String.valueOf(i);
		for(char num : numStr.toCharArray()) {
			if(Character.getNumericValue(num) == 0 || i % Character.getNumericValue(num) !=0) {
				return false;
			}
		}
		return true;
	}
	
}
