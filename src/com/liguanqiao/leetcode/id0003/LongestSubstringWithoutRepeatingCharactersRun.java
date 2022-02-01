package com.liguanqiao.leetcode.id0003;

import com.liguanqiao.leetcode.id0003.answer.Id_0003;
import com.liguanqiao.leetcode.id0003.answer.Id_0003_SlidingWindow;

/**
 * 1. 两数相加
 * 题目：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 * 题解：https://liguanqiao.com/archives/leetcode-3
 */
public class LongestSubstringWithoutRepeatingCharactersRun {

    public static void main(String[] args) {
        String str = "pwwkew";

        //滑动窗口
        Id_0003 slidingWindow = new Id_0003_SlidingWindow();
        System.out.println(slidingWindow.lengthOfLongestSubstring(str));
    }

}
