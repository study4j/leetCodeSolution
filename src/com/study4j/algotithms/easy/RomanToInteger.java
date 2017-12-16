package com.study4j.algotithms.easy;

/**
 * 
 * 13. Roman to Integer
 *
 * Given a roman numeral, convert it to an integer.
 *
 * Input is guaranteed to be within the range from 1 to 3999.
 *
 */
public class RomanToInteger {

	public static void main(String[] args) {

		String s = "MDCCCXCIX";
		System.out.println(romanToInt(s));
		
	}

	/**
	 * 
	 * I 1; V 5; X 10; L 50; C 100; D 500; M 1000
	 * 
	 */
	public static int romanToInt(String s) {

		String[] strs = s.split("");
		int status = 0;
		int result = 0;
		
		for (int i = strs.length-1; i >= 0; i--) {
			switch (strs[i]) {
			case "I":
				if(status > 0) {
					result -= 1;
				} else {
					result += 1;
				}
				break;
			case "V":
				if(status > 1) {
					result -= 5;
				} else {
					status = 1;
					result += 5;
				}
				break;
			case "X":
				if(status > 2) {
					result -= 10;
				} else {
					status = 2;
					result += 10;
				}
				break;
			case "L":
				if(status > 3) {
					result -= 50;
				} else {
					status = 3;
					result += 50;
				}
				break;
			case "C":
				if(status > 4) {
					result -= 100;
				} else {
					status = 4;
					result += 100;
				}
				break;
			case "D":
				if(status > 5) {
					result -= 500;
				} else {
					status = 5;
					result += 500;
				}
				break;
			case "M":
				if(status > 6) {
					result -= 1000;
				} else {
					status = 6;
					result += 1000;
				}
				break;
			default:
				break;
			}
		}

		return result;

	}

}
