// Problem  : Find the Duplicate Number
// Difficulty: Medium
// Tags     : Array, Two Pointers, Binary Search, Bit Manipulation
// URL      : https://leetcode.com/problems/find-the-duplicate-number/
// Solved on: 2026-04-07 14:37
// ──────────────────────────────────────────────────

class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        while(true){
            slow = nums[slow];
            fast = nums[nums[fast]];
            if(slow == fast) break;
        }
        int slow2 = nums[0];
        while(slow != slow2){
            slow = nums[slow];
            slow2 = nums[slow2];
        }
        return slow;
    }
}
