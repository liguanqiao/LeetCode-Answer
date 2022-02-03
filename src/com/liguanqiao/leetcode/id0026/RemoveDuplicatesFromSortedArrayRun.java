package com.liguanqiao.leetcode.id0026;

import com.liguanqiao.leetcode.id0026.answer.Id_0026;
import com.liguanqiao.leetcode.id0026.answer.Id_0026_DoublePointer;

/**
 * 26.删除有序数组中的重复项
 * 题目：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 * 题解：https://liguanqiao.com/archives/leetcode-26
 */
public class RemoveDuplicatesFromSortedArrayRun {

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        //双指针
        Id_0026 doublePointer = new Id_0026_DoublePointer();
        System.out.println(doublePointer.removeDuplicates(nums));
    }

}
