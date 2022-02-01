package com.liguanqiao.leetcode.id0014.answer;

/**
 * 分治
 */
public class Id_0014_DivideAndConquer implements Id_0014 {

    @Override
    public String longestCommonPrefix(String[] strs) {
        return getPrefix(strs, 0, strs.length - 1);
    }

    private String getPrefix(String[] strs, int low, int high) {
        // 子数组只有一个字符串，那它本身就是最长前缀
        if (low == high) {
            return strs[low];
        }
        // 分为两个子数组
        int mid = low + (high - low) / 2;
        // 求左数组的最长前缀
        String leftPrefix = getPrefix(strs, low, mid);
        // 求右数组的最长前缀
        String rightPrefix = getPrefix(strs, mid + 1, high);
        // 求两个最长前缀的最长前缀
        int length = Math.min(leftPrefix.length(), rightPrefix.length());
        for (int i = 0; i < length; i++) {
            if (leftPrefix.charAt(i) != rightPrefix.charAt(i)) {
                return leftPrefix.substring(0, i);
            }
        }
        return leftPrefix.substring(0, length);
    }

}
