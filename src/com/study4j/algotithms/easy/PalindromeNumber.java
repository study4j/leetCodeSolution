package com.study4j.algotithms.easy;

public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println(isPalindrome(1));
	}

	public static boolean isPalindrome(int x) {
		int originNum = x;
		if (originNum < 0) {
			originNum = 0 - originNum;
		}

		long reverseNum = 0;
		while (x > 0) {
			reverseNum = reverseNum * 10 + x % 10;
			x = x / 10;
		}
		return originNum == reverseNum;
	}

}
