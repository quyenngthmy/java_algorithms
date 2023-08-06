class Solution {
    public boolean isPalindrome(int x) {
        int reversedNum = 0, remainder;
        int originalNum = x;
        while (x > 0) {
            remainder = x % 10;
            reversedNum = reversedNum * 10 + remainder;
            x /= 10;
        }

        if (originalNum == reversedNum) {
            return true;
        } else {
            return false;
        }
    }
}