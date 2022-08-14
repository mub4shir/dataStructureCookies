package com.datastructurecookies.leetcodeaugust2022;


public class UniquePaths62 {
    public static void main(String[] args) {
        var m = 3;
        var n = 7;
        System.out.println(uniquePaths(m, n));
    }

    public static long uniquePaths(long m, long n) {
        //return uniquePathsHelper(m - 1, n - 1, new long[n][m]);
        long N = n + m - 2;
        long r = m - 1;
        double res = 1;
        for (long i = 1; i <= r; i++)
            res = res * (N - r + i) / i;
        return (long) res;
    }

    private static long uniquePathsHelper(int m, int n, long[][] memo) {
        if (m < 0 || n < 0) {
            return 0;
        } else if (m == 0 || n == 0) {
            return 1;
        } else if (memo[n][m] > 0) {
            return memo[n][m];
        } else {
            memo[n][m] = uniquePathsHelper(m - 1, n, memo) + uniquePathsHelper(m, n - 1, memo);
            return memo[n][m];
        }
    }

//    private static int uniquePaths(int m, int n) {
//        return countPaths(0, 0, m, n, new int[m][n]);
//    }

    //    private static int countPaths(int i, int j, int m, int n) {
//
//        if (i == n - 1 && j == m - 1) return 1;
//        if (i >= n || j >=m) return 0;
//        else return countPaths(i + 1, j, m, n) + countPaths(i, j + 1, m, n);
//    }

}
