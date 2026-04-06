// Problem  : Combination Sum
// Difficulty: Medium
// Tags     : Array, Backtracking
// URL      : https://leetcode.com/problems/combination-sum/
// Solved on: 2026-04-06 11:18
// ──────────────────────────────────────────────────

class Solution {
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> current = new ArrayList<>();
        backtrack(0 , candidates , target , current);
        return list;
    }
    public void backtrack(int index , int[] nums , int target ,List<Integer> current){
        if(target == 0){
            list.add(new ArrayList<>(current));
            return;
        }
        if(target < 0 || index == nums.length){
            return;
        }
        current.add(nums[index]);
        backtrack(index,nums,target-nums[index],current);
        current.remove(current.size()-1);
        backtrack(index+1,nums,target,current);
    }
}
