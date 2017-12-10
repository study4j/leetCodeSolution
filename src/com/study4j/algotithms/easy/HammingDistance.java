package com.study4j.algotithms.easy;

/**
 * 461
 * The Hamming distance between two integers is the number of positions at which 
 * the corresponding bits are different.
 * Given two integers x and y, calculate the Hamming distance.
 *
 */
public class HammingDistance {

	public static int hammingDistance(int x, int y){
		int z = x^y;
		int count = 0;
		do{
			if(z % 2 == 1){
				count ++;
			}
			z = z / 2;
		}while(z >= 1);
		return count;
	}
	
	public static void main(String[] args){
		int result = hammingDistance(4, 1);
		System.out.println(result);
	}
	
}
