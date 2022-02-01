package com.liguanqiao.leetcode.id0009.answer;

/**
 * 数字反转
 */
public class Id_0009_NumberReverse implements Id_0009 {

    @Override
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        long cur = 0;
        int num = x;
        while (num != 0) {
            cur = cur * 10 + num % 10;
            num /= 10;
        }
        return cur == x;
    }

}
