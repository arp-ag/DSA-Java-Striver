// Problem: Check if Array is Sorted and Rotated
// Link: https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
// Time: O(n), Space: O(1)
// Approach: Count number of places where arr[i] > arr[i+1]
// For sorted & rotated, this should be <= 1
// CATCH: if array is sorted and not rotated, only then the n-1th value will be greater than 0th value!!

class Solution {
    public boolean check(int[] nums) {
        int cnt=0, n=nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i+1]<nums[i]) cnt++;
            if(cnt>1) return false;
        }
        if(nums[0]<nums[n-1]) cnt++;
        return cnt<=1;
    }
}