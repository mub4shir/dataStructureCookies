package com.datastructurecookies.AlgorithmI;

public class SearchInsertPosition35 {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        int m;
        while (i <= j) {
            m = i + (j - i) / 2;
            if (nums[m] == target) return m;
            else if (target < nums[m]) j = m - 1;
            else i = m + 1;
        }
        return i;
    }
}
