package com.datastructurecookies.AlgorithmI;

public class BinarySearch704 {
    public int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        int m;
        while (i <= j) {
            m = i + (j - i) / 2;
            if (nums[m] == target) return m;
            if (target < nums[m]) j = m - 1;
            else i = m + 1;
        }
        return -1;
    }
}


