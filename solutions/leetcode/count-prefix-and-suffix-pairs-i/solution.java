// Problem  : Count Prefix and Suffix Pairs I
// Difficulty: Easy
// Tags     : Array, String, Trie, Rolling Hash, String Matching, Hash Function
// URL      : https://leetcode.com/problems/count-prefix-and-suffix-pairs-i/
// Solved on: 2026-04-07 15:10
// ──────────────────────────────────────────────────

class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(words[j].startsWith(words[i]) && words[j].endsWith(words[i])){
                    count++;
                }
            }
        }
        return count;
    }
}
