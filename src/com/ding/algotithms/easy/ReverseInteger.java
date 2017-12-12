package com.ding.algotithms.easy;

/* 7. Reverse Integer

Given a 32-bit signed integer, reverse digits of an integer.

Input:
1534236469
Output:
1056389759
Expected:
0
这题输出的值，超过integer的范围了

*/
public class ReverseInteger {
    public int reverse(int x) {
        int y = 0;
        int left;

        if (x < 0) {
            x = -x;
            while (x > 0) {
                left = x % 10;
                x = x / 10;
                y = y * 10 + left;
            }
            return -y;
        }
        while (x > 0) {
            left = x % 10;
            System.out.println(left);
            x = x / 10;
            y = y * 10 + left;
        }
        return y;
    }

    public static void main(String[] args) {
        System.out.println(new ReverseInteger().reverse(1534236469));
    }
}

class miss {
    public int reverse(int x) {
        if (x == 0) {
            return 0;
        }
        if (x < 0) {
            return - revert2(-x);
        } else {
            return revert2(x);
        }
    }

    public static int revert2(int x) {
        String s = x + "";
        String[] strings = s.split("");
        StringBuffer sb = new StringBuffer();
        for (int i = strings.length - 1; i >= 0; i --) {
            sb.append(strings[i]);
        }
        return Integer.valueOf(sb.toString());
    }

    public static void main(String[] args) {
        System.out.println(new miss().reverse(964634351));

    }

}
