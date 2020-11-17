package com.jerome.ds.sort;

import com.google.common.base.Stopwatch;

import java.util.concurrent.TimeUnit;

public class Merge {
    public static void main(String[] args) {
        Stopwatch sw = Stopwatch.createStarted();
        int[] array = new int[]{5, 3, 7, 4, 3, 1, 6, 9};
        int[] helper = new int[array.length];
        doMerge(array, helper, 0, array.length - 1);

        System.out.println(sw.elapsed(TimeUnit.NANOSECONDS));

        for (int i : array) {
            System.out.print(i);
            System.out.print(", ");
        }

    }

    private static void doMerge(int[] array, int[] helper, int left, int right) {
        if (right - left < 1) {
            return;
        }
        int mid = left + (right - left) / 2;
        doMerge(array, helper, left, mid);
        doMerge(array, helper, mid + 1, right);
        merge(array, helper, left, mid, right);

    }

    private static void merge(int[] array, int[] helper, int left, int mid, int right) {
        // 复制需要合并的两个子数组到helper数组上
        System.arraycopy(array, left, helper, left, right - left + 1);
        // 定义指向第一个子数组的指针
        int leftIndex = left;
        // 定义指向第二个子数组的指针
        int rightIndex = mid + 1;
        // 定义指向合并后的数组的指针
        int index = left;
        // 循环合并子数组, 直到合并后数组的指针越界
        while (index <= right) {
            // 如果指向两个子数组的指针都没有越界
            if (leftIndex <= mid && rightIndex <= right) {
                // 判断两个指针指向的子数组开头的数字那个更小就赋值给array数组中index指针指向的位置
                if (helper[leftIndex] <= helper[rightIndex]) {
                    array[index] = helper[leftIndex++];
                } else {
                    array[index] = helper[rightIndex++];
                }
                // 如果指向左子数组的指针没有越界, 指向右子数组的指针越界了
            } else if (leftIndex <= mid) {
                array[index] = helper[leftIndex++];
                // 如果指向右子数组的指针没有越界, 指向左子数组的指针越界了
            } else {
                array[index] = helper[rightIndex++];
            }
            // 合并后数组的指针向后移动
            index++;
        }
    }
}
