// Problem  : Subarray Product Less Than K
// Difficulty: Medium
// Tags     : Array, Binary Search, Sliding Window, Prefix Sum
// URL      : https://leetcode.com/problems/subarray-product-less-than-k/
// Solved on: 2026-04-06 20:19
// ──────────────────────────────────────────────────

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
       int left=0,right=0,ans=0;
        for(int i=0;i<nums.length;i++){
            int product=1;
            for(int j=i;j<nums.length;j++){
                product*=nums[j];
                if(product>=k)break;
                ans++;
            }
        }
        return ans;
    }
}
