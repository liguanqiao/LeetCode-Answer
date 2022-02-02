package com.liguanqiao.leetcode.id0014;

import com.liguanqiao.leetcode.id0014.answer.Id_0014;
import com.liguanqiao.leetcode.id0014.answer.Id_0014_CrosswiseScan;

/**
 * 14.最长公共前缀
 * 题目：https://leetcode-cn.com/problems/longest-common-prefix/
 * 题解：https://liguanqiao.com/archives/leetcode-14
 */
public class LongestCommonPrefixRun {

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};

        //横向扫描
        Id_0014 crosswiseScan = new Id_0014_CrosswiseScan();
        System.out.println(crosswiseScan.longestCommonPrefix(strs));

    }
}
