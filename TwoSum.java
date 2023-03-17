import java.util.*;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            int complementIndex = -1;
            for (int j = 0; j < i; j++) {
                if (nums[j] == complement) {
                    complementIndex = j;
                    break;
                }
            }
            if (complementIndex != -1) {
                return new int[] { complementIndex, i };
            }
            numMap.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}



class Solution {
    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        
        int[][] testCases = {
            {2, 7, 11, 15},
            {3, 2, 4},
            {3, 3}
        };
        int[][] targets = {
            {9},
            {6},
            {6}
        };
        int[][] expected = {
            {0, 1},
            {1, 2},
            {0, 1}
        };
        
        for (int i = 0; i < testCases.length; i++) {
            int[] result = ts.twoSum(testCases[i], targets[i][0]);
            if (result[0] != expected[i][0] || result[1] != expected[i][1]) {
                System.out.printf("Test failed for input %s, target %d. Expected %s, but got %s.\n",
                        Arrays.toString(testCases[i]), targets[i][0], Arrays.toString(expected[i]), Arrays.toString(result));
            }
        }
    }
}
