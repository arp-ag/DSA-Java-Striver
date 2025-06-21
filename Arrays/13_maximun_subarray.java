// Problem: find the subarray with the largest sum, and return its sum.
// Link: https://leetcode.com/problems/maximum-subarray/
// BRUTE: [tc=O(n^3) (BAD), sc=O(1)] for each element (i) iterate thru next elements (j), iterate thru every subarray (k) to find sum.
// BETTER: [tc=O(n^2), sc=O(1)] just add one more element in the j iteration for sum. no need for loop k.
// OPTIMAL: [tc=O(n), sc=O(1)] KADANE'S ALGORITHM.
// keep track of best sum value. if i>sum, start fresh.

class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=nums[0], sum=nums[0];
        for (int i=1; i<nums.length; i++){
            sum=Math.max(sum+nums[i],nums[i]);
            maxsum=Math.max(maxsum,sum);
        }
        return maxsum;
    }
}