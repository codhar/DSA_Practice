package com.practice;

import java.util.HashMap;
import java.util.Map;

public class TargetSum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15, 3, 6};
        int target = 9;
        Solution solution = new Solution();
        int[][] result = solution.twoSum(nums, target);
        for (int i = 0; i < result.length; i++) {
            System.out.println("Pair: " + result[i][0] + ", " + result[i][1]);
        }
    }

    static class Solution {
        public int[][] twoSum(int[] nums, int target) {
            int n = nums.length;
            int[][] result = new int[n][2];
            int count = 0;
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int complement = target - nums[i];
                if (map.containsKey(complement)) {
                    result[count][0] = complement;
                    result[count][1] = nums[i];
                    count++;
                }
                map.put(nums[i], i);
            }
            int[][] finalResult = new int[count][2];
            for (int i = 0; i < count; i++) {
                finalResult[i][0] = result[i][0];
                finalResult[i][1] = result[i][1];
            }
            return finalResult;
        }
    }
}


// Array of integers and a target sum, find all pairs of integers in the array that add up to the target sum.
