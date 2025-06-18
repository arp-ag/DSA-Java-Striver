// Problem: Left rotate an array
// Link: https://leetcode.com/problems/rotate-array/
// Time: O(n), Space: O(1)
// Approach: used a helper method : reverse
// 3 step reversal: rotate the part of array until k-1th pos, then from kth pos to n-1th pos, then the entire array
// CATCH: k>n condition!! may produce ArrayIndexOutOfBoundsException! Solution: k=k%n

class Solution {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; 
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
}