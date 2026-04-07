// Problem  : Palindrome Partitioning
// Difficulty: Medium
// Tags     : String, Dynamic Programming, Backtracking
// URL      : https://leetcode.com/problems/palindrome-partitioning/
// Solved on: 2026-04-07 14:37
// ──────────────────────────────────────────────────

class Solution {
    List<List<String>> list = new ArrayList<>();
    public List<List<String>> partition(String s) {
        List<String> current = new ArrayList<>();
        backtrack(0,current,s);
        return list;
    }
    public void backtrack(int index , List<String> current , String s){
        if(index == s.length()){
            list.add(new ArrayList<>(current));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(isPalindrome(s,index,i)){
                current.add(s.substring(index,i+1));
                backtrack(i+1,current,s);
                current.remove(current.size()-1);
            }
        }
    }
    public boolean isPalindrome(String s , int low , int high){
        while(low < high){
            if(s.charAt(low) != s.charAt(high)) return false;
            low++;
            high--;
        }
        return true;
    }
}
