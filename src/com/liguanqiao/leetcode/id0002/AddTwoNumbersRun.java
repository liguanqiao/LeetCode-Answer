package com.liguanqiao.leetcode.id0002;

import com.liguanqiao.leetcode.id0002.answer.AddTwoNumbers;
import com.liguanqiao.leetcode.id0002.answer.IAddTwoNumbers;
import com.liguanqiao.leetcode.id0002.bean.ListNode;

/**
 * 1. 两数相加
 * 题目：https://leetcode-cn.com/problems/add-two-numbers/
 * 题解：https://liguanqiao.com/archives/leetcode-2
 */
public class AddTwoNumbersRun {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(7, new ListNode(8, new ListNode(9)));
        ListNode l2 = new ListNode(3, new ListNode(2));

        IAddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        System.out.println(addTwoNumbers.addTwoNumbers(l1, l2));
    }

}
