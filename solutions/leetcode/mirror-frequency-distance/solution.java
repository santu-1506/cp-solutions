// Problem  : Mirror Frequency Distance
// Difficulty: Medium
// Tags     : 
// URL      : https://leetcode.com/problems/mirror-frequency-distance/
// Solved on: 2026-04-06 11:18
// ──────────────────────────────────────────────────

class Solution {
    public int mirrorFrequency(String s) {
        int[] lfreq  = new int[26];
        int[] dfreq = new int[10];
        for(char c : s.toCharArray()){
            if(Character.isLetter(c)){
                lfreq[c-'a']++;
            }
            else{
                dfreq[c-'0']++;
            }
        }
        int res = 0;
        for(int i=0;i<26;i++){
            int mir = 25-i;
            if(i <= mir){
                res += Math.abs(lfreq[i] - lfreq[mir]);
            }
        }
        for(int i=0;i<10;i++){
            int mir = 9-i;
            if(i<=mir){
                res += Math.abs(dfreq[i] - dfreq[mir]);
            }
        }
        return res;
    }
}
