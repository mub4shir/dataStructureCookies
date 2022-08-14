package com.datastructurecookies.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array, rotate the array to the right by k steps.
 * (k is non-negative)
 * <p>
 * * Solutions
 * <p>
 * (1) brute-force method: O(n * k) time, O(1) space
 * -> rotate one-by-one for k times
 * <p>
 * (2) use extra array: O(n) time, O(n) space
 * -> store rotated version and copy that into original array
 * <p>
 * (3) cyclic replacement: O(n) time, O(1) space
 * -> direcly place every item in its rightfully rotated position + cycle checking
 * => use PREV + TEMP + use START (for checking cycles)
 * <p>
 * - place item in rotated position while temporarily storing original item value
 * -> use as next item to store
 * - need to check for CYCLES
 * ex. {1, 2, 3, 4, 5, 6}, k = 2 와 같은 경우, 같은 item이 중복 저장될 수 있음 bcuz of cycle
 * => use START to store initial index to check for cycles
 * <p>
 * (4) use reverse: O(n) time, O(1) space
 * -> reverse entire array and then reverse parts
 * (take advantage of helper functions: reverse & swap)
 * - first, reverse entire array
 * - then, reverse first k elements
 * - finally, reverse remaining elements
 * <p>
 * <p>
 * ** What I learned
 * <p>
 * ** SHIFTING ITEMS BY 1
 * - use PREVIOUS value to store into current index
 * -> prev initialized to LAST item's value
 * - use TEMP value to temporarily store value at current index
 * -> use later to update prev value
 * <p>
 * int prev = arr[arr.size() - 1];
 * for (int i = 0; i < arr.size(); i++) {
 * int temp = arr[i];
 * arr[i] = prev;
 * prev = temp;
 * }
 * <p>
 * => use PREV & TEMP
 * <p>
 * 2) shifting RIGHT <-> LEFT
 * - RIGHT: last k items come to front
 * <p>
 * - LEFT: front k items come to last
 * <p>
 * => 계속 틀리는 부분이니 조심할 것!
 * <p>
 * 3) careful w/ INDEXING
 * -> (i - k) might end up to be negative and be erroneous
 * <p>
 * => use (i + k) instead!
 */

public class RotateArrayRight {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        int k = 2;
        System.out.println(bruteForceRotate(list, k).stream().toList());


    }

    /**
     * (1) brute-force method: O(n * k) time, O(1) space
     */
    public static List<Integer> bruteForceRotate(List<Integer> nums, int k) {

        // for k times,
        for (int i = 0, size = nums.size(); i < k; i++) {

            // set prev to last num in array
            int prev = nums.get(size - 1);

            // rotate the array by one
            for (int j = 0; j < size; j++) {

                // temporarily store num at current index
                int temp = nums.get(j);

                //set the current index to prev num
                nums.set(j, prev);

                //update prev num w/ temporarily stored num
                prev = temp;
            }
        }
        return nums;

    }
}
