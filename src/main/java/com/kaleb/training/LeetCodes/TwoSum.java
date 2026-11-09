package com.kaleb.training.LeetCodes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        System.out.println("Input array: " + Arrays.toString(twoSum(nums, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (indexMap.containsKey(complement)) {
                return new int[] { indexMap.get(complement), i };
            }

            indexMap.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution exists");
    }
}
