// Problem  : Valid Perfect Square
// Difficulty: Easy
// Tags     : Math, Binary Search
// URL      : https://leetcode.com/problems/valid-perfect-square/
// Solved on: 2026-04-06 11:18
// ──────────────────────────────────────────────────

class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 1) return true;
        long low = 0; 
        long high = num; 
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long square = mid * mid; 
            if (square == num) {
                return true; 
            } else if (square < num) {
                low = mid + 1; 
            } else {
                high = mid - 1; 
            }
        }
        return false; 
    }
}
