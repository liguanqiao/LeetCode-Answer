package com.liguanqiao.leetcode.id912;

import com.liguanqiao.leetcode.id912.answer.BubbleSort;
import com.liguanqiao.leetcode.id912.answer.ISortArray;
import com.liguanqiao.leetcode.id912.answer.SelectSort;

import java.util.Arrays;

/**
 * 912. 排序数组
 * 题目：https://leetcode-cn.com/problems/sort-an-array/
 * 题解：https://liguanqiao.com/archives/leetcode-912
 */
public class SortArrayRun {

    public static void main(String[] args) {
        int[] nums = {5, 2, 3, 1};

        //冒泡排序
        ISortArray bubbling = new BubbleSort();
        System.out.println(Arrays.toString(bubbling.sortArray(nums)));

        //选择排序
        ISortArray select = new SelectSort();
        System.out.println(Arrays.toString(select.sortArray(nums)));
    }

}
