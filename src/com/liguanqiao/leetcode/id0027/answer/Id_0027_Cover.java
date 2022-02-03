package com.liguanqiao.leetcode.id0027.answer;

/**
 * 覆盖
 */
public class Id_0027_Cover implements Id_0027 {

    @Override
    public int removeElement(int[] nums, int val) {
        int ans = 0;
        for (int num : nums) {
            if (num != val) {
                nums[ans++] = num;
            }
        }
        return ans;
    }

}
