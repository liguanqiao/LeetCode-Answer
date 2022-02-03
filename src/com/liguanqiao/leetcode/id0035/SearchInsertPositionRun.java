package com.liguanqiao.leetcode.id0035;

import com.liguanqiao.leetcode.id0035.answer.Id_0035;
import com.liguanqiao.leetcode.id0035.answer.Id_0035_Dichotomy;

/**
 * 35.搜索插入位置
 * 题目：https://leetcode-cn.com/problems/search-insert-position/
 * 题解：https://liguanqiao.com/archives/leetcode-35
 */
public class SearchInsertPositionRun {

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 2;

        Id_0035 dichotomy = new Id_0035_Dichotomy();
        System.out.println(dichotomy.searchInsert(nums, target));
    }

}
