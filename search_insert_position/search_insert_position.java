class Solution {
     public int searchInsert(int[] nums, int target) {
        if(nums.length==1 && target<=nums[0])
            return 0;
        int i=0,j=nums.length-1;
        while(i<j && nums[j]>=target && nums[i]<=target)
        {
            int mid=(i+j)/2;
            if(nums[mid]>target && nums[mid+1]<target)
                return mid+1;
            if(nums[mid]==target)
                return mid;
            if(nums[mid]<target)
                i=mid+1;
            else
                j=mid;
        }
        if(target>nums[j])
            return j+1;
        if(i<nums.length)
            return i;
        else
            return i+1;
    }