package com.datastructurecookies.slidingwindow;

import java.util.Arrays;

public class AverageOfAllSubArraysOfKSize {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k = 5;
        double[] result = averageOfAllSubArraysOfKSize(arr, k);
        System.out.println(Arrays.toString(result));

    }


//    public static double[] averageOfAllSubArraysOfKSize(int[] arr, int k) {
//        int n = arr.length;
//        double[] result = new double[n - k + 1];
//        for (int i = 0; i < n - k + 1; i++) {
//            double sum = 0;
//            for (int j = i; j < i + k; j++)
//                sum += arr[j];
//            result[i] = sum / k;
//        }
//        return result;
//    }

    public static double[] averageOfAllSubArraysOfKSize(int[] arr, int k) {
        int n = arr.length;
        double[] result = new double[n - k + 1];
        double windowSum = 0;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < n; windowEnd++) {
            windowSum += arr[windowEnd];
            if (windowEnd >= k - 1) {
                result[windowStart] = windowSum / k;
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return result;
    }
}
