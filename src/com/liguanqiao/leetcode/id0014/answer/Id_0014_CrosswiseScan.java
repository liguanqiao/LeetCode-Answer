package com.liguanqiao.leetcode.id0014.answer;

/**
 * 横向扫描
 */
public class Id_0014_CrosswiseScan implements Id_0014 {

    @Override
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            String str = strs[i];
            int le = Math.min(str.length(),prefix.length());
            while (j < le && prefix.charAt(j) == str.charAt(j)) {
                j++;
            }
            prefix = str.substring(0, j);
            //判断是否一个都对不上
            if (j == 0) {
                break;
            }
        }

        return prefix;
    }

}
