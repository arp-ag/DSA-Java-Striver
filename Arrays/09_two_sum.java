// Problem: return indices of the two numbers such that they add up to target.
// Link: https://leetcode.com/problems/two-sum/
// brute: (tc:O(n^2) sc:O(1)) check for each element the other elements if their sum==target.
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    res[0]=i;
                    res[1]=j;
                    return res;
                }
            }
        }
        return res;
    }
}

//better: (tc:O(n) sc:O(n)) use HashMap
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        //value->index (keys are unique, not values)
        for(int i=0; i<nums.length; i++){
            int diff=target-nums[i];
            if (map.containsKey(diff)){
                return new int[] {map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}