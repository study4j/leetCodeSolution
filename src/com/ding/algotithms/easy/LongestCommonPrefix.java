package com.ding.algotithms.easy;

import java.util.Objects;

/* 14. Longest Common Prefix

* */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (Objects.isNull(strs) || strs.length == 0) {
            return "";
        }

        if (strs[0].equals("")) {
            return "";
        }
        String pre = strs[0].substring(0, 1);
        int begin = 1;

        for (int i = 0; i < strs[0].length(); i ++) {
            for (String str: strs) {
                if (str.indexOf(pre) != 0) {
                    return strs[0].substring(0, begin - 1);
                }
            }

            if (begin == strs[0].length()) {
                return pre;
            }

            begin ++;
            pre = strs[0].substring(0, begin);
        }


        return "";
    }

    public static void main(String[] args) {
        String[] aa = {"aas"};
        new LongestCommonPrefix().longestCommonPrefix(aa);
    }
}
