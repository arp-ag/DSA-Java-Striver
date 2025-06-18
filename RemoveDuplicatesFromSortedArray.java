// Problem: Remove duplicates from sorted array
// Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Time: O(n), Space: O(1)
// Approach: used 2 pointers:
// one to traverse the array (i)
// another (j) to keep track of position that needs replacement (also helps get the length of concerned array length)
// CATCH: second pointer j helps track position as well as returns the length of modified array. 2 birds with one stone!

class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length, j=1;
        for(int i=1; i<n; i++){
            if(nums[i]!=nums[i-1]){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}