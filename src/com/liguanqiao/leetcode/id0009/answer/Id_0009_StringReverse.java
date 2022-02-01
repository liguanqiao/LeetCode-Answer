package com.liguanqiao.leetcode.id0009.answer;

/**
 * 字符串反转
 */
public class Id_0009_StringReverse implements Id_0009 {

    @Override
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        String s = String.valueOf(x);
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();

        return s.equals(sb.toString());
    }

}
