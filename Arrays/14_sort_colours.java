// Problem: Sort an array of 0's, 1's and 2's
// Link: https://leetcode.com/problems/sort-colors/
// BRUTE: [tc=O(nlogn), sc=O(n)] any sorting algo.
// BETTER: [tc=O(2n), sc=O(1)] take 3 count variables.
class Solution {
    public void sortColors(int[] nums) {
        int cnt0=0, cnt1=0, cnt2=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]==0) cnt0++;
            if(nums[i]==1) cnt1++;
            if(nums[i]==2) cnt2++;
        }
        int k=0;
        for (int i=0;i<cnt0;i++){
            nums[k++]=0;
        }
        for (int i=0;i<cnt1;i++){
            nums[k++]=1;
        }
        for (int i=0;i<cnt2;i++){
            nums[k++]=2;
        }
    }
}
// OPTIMAL: [tc=O(n), sc=O(1)] DUTCH NATIONAL FLAG ALGORITHM.
// keep track of best sum value. if i>sum, start fresh.