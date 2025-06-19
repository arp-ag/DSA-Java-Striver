// Problem: return the only number in the range that is missing from the array.
// Link: https://leetcode.com/problems/missing-number/
// brute: (tc:O(n^2), sc:O(1)) Linear search for each element- nested loop!
// better: (tc:O(n), sc:O(n)) HashSet- one loop for entering values, another for checking.
class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        for(int i=0;i<=nums.length;i++){
            if(!set.contains(i)) return i;
        }
        return -1;
    }
}
// optimal: (tc:O(n), sc:O(1)) 2 approaches: 
// 1. sum- use formula n(n+1)/2, comapre it with sum of numbers present in the array, the difference is the answer!
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=n*(n+1)/2;
        for(int num : nums){
            sum-=num;
        }
        return sum;
    }
}
// 2. bit manipulation- using xor, xor1 for [0,n], xor2 for the array. answer is the xor of xor1 and xor2!
class Solution {
    public int missingNumber(int[] nums) {
        int xor1=0, xor2=0; //int xor=0
        for(int i=0;i<nums.length;i++){
            xor1^=i+1;
            xor2^=nums[i];
            // or xor^=i+1^nums[i]
        }
        return xor1^xor2; //return xor
    }
}
// Time: O(n), Space: O(1)
// CATCH: HashSet and bit manipulation, I'm currently not very familiar with these.