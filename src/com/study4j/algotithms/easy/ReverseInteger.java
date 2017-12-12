package com.study4j.algotithms.easy;

/**
 * 7 Given a 32-bit signed integer, reverse digits of an integer.
 */
public class ReverseInteger {

	public static void main(String[] args) {
		int num = reverse(-123);
		System.out.println(num);
	}
	
	public static int reverse(int x) {
		long num;
		if(x < 0) {
			num =  Long.valueOf("-" + getNum(1, String.valueOf(x).split("")));
		} else {
			num =  Long.valueOf(getNum(0, String.valueOf(x).split("")));
		}
		
		if(num >= Integer.MAX_VALUE || num <= Integer.MIN_VALUE) {
			return 0;
		}
		return Integer.valueOf(String.valueOf(num));
	}

	private static String getNum(int n, String[] numStrs) {
		String numStr = "";
		for(int i = numStrs.length-1 ; i >= n; i--) {
			if(Character.isDigit(numStrs[i].charAt(0))) {
				numStr = numStr + numStrs[i];
			}
		}
		return numStr;
	}
	
}
