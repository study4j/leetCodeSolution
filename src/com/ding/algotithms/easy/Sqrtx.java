package com.ding.algotithms.easy;

/*69. Sqrt(x)

Implement int sqrt(int x).

Compute and return the square root of x.

x is guaranteed to be a non-negative integer.*/

import java.util.Scanner;

public class Sqrtx {

    public static void main(String[] args) {

        System.out.println(new Sqrtx().getSqrt(88));
    }


    public Integer getSqrt(int x) {
        int n = x / 2;
        if (x == 0) {
            return 0;
        }
        if (x < 4) {
            return 1;
        } if (x < 6) {
            return 2;
        }

        do {
            n--;
        } while (n > (x / n));
        return n;
    }

    /*public Integer getSqrt(int x) {
        int n = x / 2;
        if (x == 0) {
            return 0;
        }
        if (x < 4) {
            return 1;
        } if (x < 6) {
            return 2;
        }

            do {
                n--;
            } while (n * n > x);
            return n;
    }*/
}