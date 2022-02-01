package com.liguanqiao.leetcode.id0014;

import com.liguanqiao.leetcode.id0014.answer.Id_0014;
import com.liguanqiao.leetcode.id0014.answer.Id_0014_CrosswiseScan;

public class LongestCommonPrefixRun {

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};

        //横向扫描
        Id_0014 crosswiseScan = new Id_0014_CrosswiseScan();
        System.out.println(crosswiseScan.longestCommonPrefix(strs));

    }
}
