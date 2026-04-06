// Problem  : Robot Return to Origin
// Difficulty: Easy
// Tags     : String, Simulation
// URL      : https://leetcode.com/problems/robot-return-to-origin/
// Solved on: 2026-04-06 11:18
// ──────────────────────────────────────────────────

class Solution {
    public boolean judgeCircle(String moves) {
        int x=0;
        int y=0;
        for(char c: moves.toCharArray())
        {
            if(c=='R')
            {
                x++;
            }
            else if(c=='L')
            {
                x--;
            }
            else if(c=='D')
            {
                y--;
            }
            else
            {
                y++;
            }
        }
        if(x==0 && y==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
