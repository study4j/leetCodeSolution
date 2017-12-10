package com.study4j.algotithms.easy;

/**
 * 657
 * Initially, there is a Robot at position (0, 0). 
 * Given a sequence of its moves, judge if this robot makes a circle,
 *  which means it moves back to the original place.
 *  The move sequence is represented by a string. 
 *  And each move is represent by a character. 
 *  The valid robot moves are R (Right), L (Left), U (Up) and D (down). 
 *  The output should be true or false representing whether the robot makes a circle.
 *
 */
public class JudgeRouteCircle {

	public static boolean judgeCircle(String moves) {
		
		int x = 0;
		int y = 0;
		String[] move = moves.split("");
		for(String str : move) {
			switch (str) {
			case "U":
				y ++;
				break;
			case "D":
				y --;
				break;
			case "R":
				x ++;
				break;
			case "L":
				x --;
				break;
			default:
				break;
			}
		}
		if(x == 0 && y == 0) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(judgeCircle("UD"));
		System.out.println(judgeCircle("LL"));
	}
	
}
