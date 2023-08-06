class Solution {
    public int climbStairs(int n) {
        int s1 = 1;
        int s2 = 1;
        for (int i = 2; i <= n; ++i) {
            int dp = s1 + s2;
            s2 = s1;
            s1 = dp;
        }
        return s1;
    }
}