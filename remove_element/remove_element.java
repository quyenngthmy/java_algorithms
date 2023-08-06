class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0, a = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                a++;
            } else {
                nums[k++] = nums[i];
            }
        }
        return nums.length - a;
    }
}