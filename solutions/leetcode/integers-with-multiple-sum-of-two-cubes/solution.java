// Problem  : Integers With Multiple Sum of Two Cubes
// Difficulty: Medium
// Tags     : 
// URL      : https://leetcode.com/problems/integers-with-multiple-sum-of-two-cubes/
// Solved on: 2026-04-06 11:18
// ──────────────────────────────────────────────────

class Solution {
    public List<Integer> findGoodIntegers(int n) {
        int last = (int)Math.cbrt(n);
        HashMap<Long, Integer> map = new HashMap<>();
        for (int a = 1; a <= last; a++) {
            long aCube = (long)a * a * a;

            for (int b = a; b <= last; b++) { 
                long sum = aCube + (long)b * b * b;

                if (sum > n) break;

                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (long key : map.keySet()) {
            if (map.get(key) >= 2) {
                res.add((int) key);
            }
        }
        Collections.sort(res);
        return res;
    }
}
