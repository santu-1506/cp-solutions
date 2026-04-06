// Problem  : Subarray Sum Equals K
// Difficulty: Medium
// Tags     : Array, Hash Table, Prefix Sum
// URL      : https://leetcode.com/problems/subarray-sum-equals-k/
// Solved on: 2026-04-06 11:18
// ──────────────────────────────────────────────────

class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int res = 0;
        int sum = 0;
        for(int i : nums){
            sum += i;
            if(map.containsKey(sum-k)){
                res += map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return res;
    }
}
