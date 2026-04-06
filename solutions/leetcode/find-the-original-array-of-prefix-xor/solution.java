// Problem  : Find The Original Array of Prefix Xor
// Difficulty: Medium
// Tags     : Array, Bit Manipulation
// URL      : https://leetcode.com/problems/find-the-original-array-of-prefix-xor/
// Solved on: 2026-04-06 11:18
// ──────────────────────────────────────────────────

class Solution {
    public int[] findArray(int[] pref) {
        int n = pref.length;
        int[] res = new int[n];
        res[0] = pref[0];
        for (int i = 1; i < n; i++) {
            res[i] = pref[i] ^ pref[i - 1];
        }
        return res;
    }
}
