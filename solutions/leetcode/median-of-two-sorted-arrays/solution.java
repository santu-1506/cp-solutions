// Problem  : Median of Two Sorted Arrays
// Difficulty: Hard
// Tags     : Array, Binary Search, Divide and Conquer
// URL      : https://leetcode.com/problems/median-of-two-sorted-arrays/
// Solved on: 2026-04-07 15:37
// ──────────────────────────────────────────────────

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length; 
        int[] res = new int[m + n];
        for(int i = 0; i < m; i++){
            res[i] = nums1[i];
        }
        int k = 0;
        for(int j = m; j < m + n; j++){
            res[j] = nums2[k++];
        }
        Arrays.sort(res);
        int total = m + n;
        if(total % 2 == 1){
            return res[total / 2];
        } else {
            int mid = total / 2;
            return (res[mid] + res[mid - 1]) / 2.0;
        }
    }
}
