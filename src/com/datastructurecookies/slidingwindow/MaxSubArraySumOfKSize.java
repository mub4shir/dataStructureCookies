package com.datastructurecookies.slidingwindow;

public class MaxSubArraySumOfKSize {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        var result = findMaxSumSubArrayBruteForce(k, arr);
        var result1 = findMaxSumSubArrayOptimized1(k, arr);
        var result2 = findMaxSumSubArrayOptimized2(k, arr);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }

    public static int findMaxSumSubArrayBruteForce(int k, int[] arr) {
        int n = arr.length;
        int maxSum = 0;
        int windowSum;
        for (int i = 0; i < n - k + 1; i++) {
            windowSum = 0;
            for (int j = i; j < i + k; j++) {
                windowSum += arr[j];
                maxSum = Math.max(maxSum, windowSum);
            }
        }
        return maxSum;

    }

    public static int findMaxSumSubArrayOptimized2(int k, int[] arr) {
        int n = arr.length;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int i = 0, j = 0;
        while (j < n) {
            sum += arr[j];
            if (j - i + 1 < k) j++;
            else if (j - i + 1 == k) {
                maxSum = Math.max(maxSum, sum);
                sum -= arr[i];
                i++;
                j++;
            }
        }
        return maxSum;

    }

    public static int findMaxSumSubArrayOptimized1(int k, int[] arr) {
        int n = arr.length;
        int windowSum = 0;
        int maxSum = 0;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < n; windowEnd++) {
            windowSum += arr[windowEnd];
            if (windowEnd >= k - 1) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return maxSum;
    }


}
