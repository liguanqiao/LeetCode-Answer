package com.liguanqiao.leetcode.id0001;

import com.liguanqiao.leetcode.id0001.answer.HashTwoSum;
import com.liguanqiao.leetcode.id0001.answer.ITwoSum;
import com.liguanqiao.leetcode.id0001.answer.ViolenceTwoSum;

import java.util.Arrays;

/**
 * 1. 两数之和
 * 题目：https://leetcode-cn.com/problems/two-sum/
 * 题解：https://liguanqiao.com/archives/leetcode-1
 */
public class TwoSumRun {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        //暴力枚举
        ITwoSum violence = new ViolenceTwoSum();
        System.out.println(Arrays.toString(violence.twoSum(nums, target)));

        //哈希表
        ITwoSum hash = new HashTwoSum();
        System.out.println(Arrays.toString(hash.twoSum(nums, target)));
    }

}
