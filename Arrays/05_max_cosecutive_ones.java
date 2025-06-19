// Problem: Max Consecutive Ones
// Link: https://leetcode.com/problems/max-consecutive-ones/
// Time: O(n), Space: O(1)
// Approach: Use a counter `j` to count consecutive 1s while iterating. Update `max` with the maximum of `max` and `j`.
// CATCH: Initially, I updated `max` only in the else block — missed final streak of 1s if array ended with 1s.

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0, j=0;
        for(int num : nums){
            if(num==1){
                j++;
                max=Math.max(j,max);
            }
            else{
                j=0;
            }
        }
        return max;
    }
}