package com.study4j.algotithms.easy;

/*69. Sqrt(x)

Implement int sqrt(int x).

Compute and return the square root of x.

x is guaranteed to be a non-negative integer.*/

import java.util.Scanner;

public class Sqrtx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int num = scanner.nextInt();
            System.out.println(new Sqrtx().getSqrt(num));
        }
    }

    public Integer getSqrt(int x) {
        int n = x / 2;
        System.out.println("--------now " + n);
        if (x < 0) {
            return null;
        } else if (x < 4) {
            return 1;
        } else if (x < 6) {
            return 2;
        }

            do {
                n--;
            } while (n * n > x);
            return n;
    }
}