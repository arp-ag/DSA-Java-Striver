// Problem: Union of two sorted arrays
// Link: https://takeuforward.org/plus/dsa/problems/union-of-two-sorted-arrays
// Time: O(n), Space: O(1)
// brute: use HashSet(stores unique elements)- store elements of nums1, then of nums2. APARANTLY, HashTree must be used to preserve ascending order.
class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums1) //O(n1)
            set.add(num); //O(logn)... O(n1logn)
        for (int num : nums2) 
            set.add(num); //O(n2logn)
       
        int[] res = new int[set.size()];
        int idx = 0;
        for (int num : set) {
            res[idx++] = num;
        }

        return res; //n1+n2(worst case)(to return the ans)
    }
}

// optimized: I NEED TO DO THIS AGAIN! it easy but lengthy. Need to have clear logic in mind.
class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        int i=0, j=0,k=0, n1=nums1.length, n2=nums2.length;
        int[] res=new int[n1+n2];
        while(n1>i && n2>j){
            if(nums1[i] < nums2[j]){
                if(k==0 || res[k-1]!=nums1[i]){
                    res[k++]=nums1[i];
                }
                i++;
            }
            else if(nums1[i] > nums2[j]){
                if(k==0 || res[k-1]!=nums2[j]){
                    res[k++]=nums2[j];
                }
                j++;
            }
            else{
                if(k==0 || res[k-1]!=nums1[i]){
                    res[k++]=nums1[i];
                }
                i++; j++;
            }
        }
        while(n1>i){
            if(k==0 || res[k-1]!=nums1[i]){
                res[k++]=nums1[i];
            }
            i++;
        }
        while(n2>j){
            if(k==0 || res[k-1]!=nums2[j]){
                res[k++]= nums2[j];
            }
            j++;
        }
        res=Arrays.copyOf(res,k);
        return res;
    }
}