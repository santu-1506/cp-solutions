// Problem  : Height Checker
// Difficulty: Easy
// Tags     : Array, Sorting, Counting Sort
// URL      : https://leetcode.com/problems/height-checker/
// Solved on: 2026-04-06 11:18
// ──────────────────────────────────────────────────

class Solution {
    public int heightChecker(int[] heights) {
        int count = 0;
        int[] expected = heights.clone();
        Arrays.sort(expected);
        for(int i=0;i<heights.length;i++){
            if(heights[i] != expected[i]){
                count++;
            }
        }
        return count;
    }
}
