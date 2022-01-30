package com.liguanqiao.leetcode.id912.answer;

import java.util.Arrays;

/**
 * 希尔排序
 */
public class ShellSort implements ISortArray {

    @Override
    public int[] sortArray(int[] nums) {
        // 对 arr 进行拷贝，不改变参数内容
        int[] arr = Arrays.copyOf(nums, nums.length);

        int gap = 1;
        while (gap < arr.length) {
            gap = gap * 3 + 1;
        }

        while (gap > 0) {
            for (int i = gap; i < arr.length; i++) {
                int tmp = arr[i];
                int j = i - gap;
                while (j >= 0 && arr[j] > tmp) {
                    arr[j + gap] = arr[j];
                    j -= gap;
                }
                arr[j + gap] = tmp;
            }
            gap = (int) Math.floor(gap / 3);
        }

        return arr;
    }

}
