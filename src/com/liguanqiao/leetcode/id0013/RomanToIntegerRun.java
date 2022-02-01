package com.liguanqiao.leetcode.id0013;

import com.liguanqiao.leetcode.id0013.answer.Id_0013;
import com.liguanqiao.leetcode.id0013.answer.Id_0013_EasyAnswer;

/**
 * 1. 两数之和
 * 题目：https://leetcode-cn.com/problems/roman-to-integer/
 * 题解：https://liguanqiao.com/archives/leetcode-13
 */
public class RomanToIntegerRun {

    public static void main(String[] args) {
        String str = "MCMXCIV";

        //简单解法
        Id_0013 easyAnswer = new Id_0013_EasyAnswer();
        System.out.println(easyAnswer.romanToInt(str));
    }

}
