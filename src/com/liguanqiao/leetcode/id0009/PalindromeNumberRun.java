package com.liguanqiao.leetcode.id0009;

import com.liguanqiao.leetcode.id0009.answer.Id_0009;
import com.liguanqiao.leetcode.id0009.answer.Id_0009_NumberReverse;
import com.liguanqiao.leetcode.id0009.answer.Id_0009_NumberReverseHalf;
import com.liguanqiao.leetcode.id0009.answer.Id_0009_StringReverse;

/**
 * 1. 两数之和
 * 题目：https://leetcode-cn.com/problems/palindrome-number/
 * 题解：https://liguanqiao.com/archives/leetcode-9
 */
public class PalindromeNumberRun {

    public static void main(String[] args) {
        int x = 1231;

        //字符串反转
        Id_0009 stringReverse = new Id_0009_StringReverse();
        System.out.println(stringReverse.isPalindrome(x));

        //数字反转
        Id_0009 numberReverse = new Id_0009_NumberReverse();
        System.out.println(numberReverse.isPalindrome(x));

        //数字反转一半
        Id_0009 numberReverseHalf = new Id_0009_NumberReverseHalf();
        System.out.println(numberReverseHalf.isPalindrome(x));
    }

}
