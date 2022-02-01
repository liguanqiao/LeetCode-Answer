package com.liguanqiao.leetcode.id0001.answer;

import java.util.HashMap;
import java.util.Map;

/**
 * 哈希表
 */
public class HashTwoSum implements ITwoSum {

    @Override
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            int y = target - nums[i];
            if (hashtable.containsKey(y)) {
                return new int[]{hashtable.get(y), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }

}
