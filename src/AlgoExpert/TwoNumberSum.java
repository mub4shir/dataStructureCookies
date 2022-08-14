package AlgoExpert;

import java.util.Arrays;
import java.util.HashMap;


public class TwoNumberSum {

    public static void main(String[] args) {
        int[] arr = {3, -4, 8, 11, 1, -1, 6};
        int targetSum = 10;
        System.out.println(Arrays.toString(getPairBruteForce(arr, targetSum)));
        System.out.println(Arrays.toString(getPair(arr, targetSum)));
        System.out.println(Arrays.toString(getPairTwoPointers(arr, targetSum)));
    }
    // O(n) time | O(n) space
    private static int[] getPair(int[] arr, int targetSum) {
        HashMap<Integer, Boolean> nums = new HashMap<>();
        for (int num : arr) {
            int potentialMatch = targetSum - num;
            if (nums.containsKey(potentialMatch))
                return potentialMatch > num ? new int[]{num, potentialMatch} : new int[]{potentialMatch, num};
            else nums.put(num, true);
        }
        return new int[0];
    }
    // O(n^2) time | O(1) space
    private static int[] getPairBruteForce(int[] arr, int targetSum) {
        for (int i = 0; i < arr.length - 1; i++) {
            int firstNum = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                int secondNum = arr[j];
                if (firstNum + secondNum == targetSum) {
                    return firstNum > secondNum ? new int[]{secondNum, firstNum} : new int[]{firstNum, secondNum};
                }
            }
        }
        return new int[0];
    }

    // O(nlog(n)) time | O(1) space
    private static int[] getPairTwoPointers(int[] arr, int targerSum) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        while (left<right){
            int currentSum=arr[left]+arr[right];
            if(currentSum==targerSum)return new int[]{arr[left],arr[right]};
            else if(currentSum<targerSum)left++;
            else if(currentSum>targerSum)right--;
        }
        return new int[0];
    }
}
