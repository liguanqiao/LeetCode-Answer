package com.liguanqiao.leetcode.id0027;

import com.liguanqiao.leetcode.id0027.answer.Id_0027;
import com.liguanqiao.leetcode.id0027.answer.Id_0027_Cover;

/**
 * 27.移除元素
 * 题目：https://leetcode-cn.com/problems/remove-element/
 * 题解：https://liguanqiao.com/archives/leetcode-27
 */
public class RemoveElementRun {

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;

        //覆盖
        Id_0027 cover = new Id_0027_Cover();
        System.out.println(cover.removeElement(nums, val));
    }

}
