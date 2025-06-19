// Problem: a non-empty array of integers nums, every element appears twice except for one. Find that single one.
// Link: https://leetcode.com/problems/single-number/
// Time: O(n), Space: O(1)
// Approach: bit manipulation
// REMEMBER: dont forget to initialize xor=0.

class Solution {
    public int singleNumber(int[] nums) {
        int xor=0;
        for(int num : nums){
            xor^=num;
        }
        return xor;
    }
}