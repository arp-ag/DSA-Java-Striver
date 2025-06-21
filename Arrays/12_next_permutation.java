// Problem: Next Permutation
// Link: https://leetcode.com/problems/next-permutation
// BRUTE: [tc=n!*n (BAD)] generate all possible perms (recursion), linear search, display next perm.
// BRUTE: [tc=2*n*m, sc=n+m] 
// Step 1: iterate fro last, find i such that element of i<i+1. 
// Step 2: iterate from last, find j such that j is just-larger than i.
//         the first number in iteration, that is >i.
// Step 3: reverse arr from i+1 to end.
// CATCH: look our of ArrayIndexOutOfBoundException. (check line 15, 16.)

class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length, i, j;
        if (n<=1) return;
        // fixed OutOfBoundException, check i>=0 before.
        // check equal to condition as well!
        for(i=n-2; i>=0 && nums[i]>=nums[i+1] ; i--);
        if(i==-1){
            reverse(nums, 0, n-1);
            return;
        }
        for(j=n-1; j>i; j--){
            if(nums[j]>nums[i]){
                break;
            }
        }
        swapValues(nums, i, j);
        reverse(nums, i+1,n-1);
    }
    public void swapValues(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void reverse(int[] arr, int start, int end){
        while(start<end){
            swapValues(arr, start, end);
            start++;
            end--;
        }
    }
}