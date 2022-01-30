package com.liguanqiao.leetcode.id912;

import com.liguanqiao.leetcode.id912.answer.*;

import java.util.Arrays;

/**
 * 912. 排序数组
 * 题目：https://leetcode-cn.com/problems/sort-an-array/
 * 题解：https://liguanqiao.com/archives/leetcode-912
 */
public class SortArrayRun {

    public static void main(String[] args) throws Exception {
        //冒泡排序
        bubble();

        //选择排序
        select();

        //插入排序
        insert();

        //希尔排序
        shell();

        //归并排序
        merge();

        //快速排序
        quick();

        //堆排序
        heap();

        //计数排序
        counting();

        //桶排序
        bucket();

        //基数排序
        radix();
    }

    private static void bubble() throws Exception {
        int[] nums = {5, 2, 3, 1};
        ISortArray bubble = new BubbleSort();
        System.out.println(Arrays.toString(bubble.sortArray(nums)));
    }

    private static void select() throws Exception {
        int[] nums = {5, 2, 3, 1};
        ISortArray select = new SelectSort();
        System.out.println(Arrays.toString(select.sortArray(nums)));
    }

    private static void insert() throws Exception {
        int[] nums = {5, 2, 3, 1};
        ISortArray insert = new InsertSort();
        System.out.println(Arrays.toString(insert.sortArray(nums)));
    }

    private static void shell() throws Exception {
        int[] nums = {5, 2, 3, 1};
        ISortArray shell = new ShellSort();
        System.out.println(Arrays.toString(shell.sortArray(nums)));
    }

    private static void merge() throws Exception {
        int[] nums = {5, 2, 3, 1};
        ISortArray merge = new MergeSort();
        System.out.println(Arrays.toString(merge.sortArray(nums)));
    }

    private static void quick() throws Exception {
        int[] nums = {5, 2, 3, 1};
        ISortArray quick = new QuickSort();
        System.out.println(Arrays.toString(quick.sortArray(nums)));
    }

    private static void heap() throws Exception {
        int[] nums = {5, 2, 3, 1};
        ISortArray heap = new HeapSort();
        System.out.println(Arrays.toString(heap.sortArray(nums)));
    }

    private static void counting() throws Exception {
        int[] nums = {5, 2, 3, 1};
        ISortArray counting = new CountingSort();
        System.out.println(Arrays.toString(counting.sortArray(nums)));
    }

    private static void bucket() throws Exception {
        int[] nums = {5, 2, 3, 1};
        ISortArray bucket = new BucketSort();
        System.out.println(Arrays.toString(bucket.sortArray(nums)));
    }

    private static void radix() throws Exception {
        int[] nums = {5, 2, 3, 1};
        ISortArray radix = new RadixSort();
        System.out.println(Arrays.toString(radix.sortArray(nums)));
    }

}
