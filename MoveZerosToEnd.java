// Problem: Move zeros to end
// Link: https://leetcode.com/problems/move-zeroes/
// Time: O(n), Space: O(1)
// Approach: used two pointers like the question remove duplicates from sorted array
// one pointer i to traverse the array, second to keep track of position to be altered
// CATCH: all the zeros are added separately in the end via an array starting from k!

class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length, k=0;
        if(n<=1) return;
        for(int i=0; i<n; i++){
            if(nums[i]!=0){
                nums[k]=nums[i];
                k++;
            }
        }
        for(int i=k; i<n; i++)
            nums[i]=0;
    }
}