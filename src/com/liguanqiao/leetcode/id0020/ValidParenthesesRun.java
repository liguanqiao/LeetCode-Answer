package com.liguanqiao.leetcode.id0020;

import com.liguanqiao.leetcode.id0020.answer.Id_0020;
import com.liguanqiao.leetcode.id0020.answer.Id_0020_Stack;

/**
 * 20.有效的括号
 * 题目：https://leetcode-cn.com/problems/valid-parentheses/
 * 题解：https://liguanqiao.com/archives/leetcode-20
 */
public class ValidParenthesesRun {

    public static void main(String[] args) {
        String str = "()[]{}";

        //栈
        Id_0020 stack = new Id_0020_Stack();
        System.out.println(stack.isValid(str));
    }

}
