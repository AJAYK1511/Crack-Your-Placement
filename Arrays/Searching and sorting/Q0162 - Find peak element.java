class Solution {
    public int findPeakElement(int[] nums) {
        int h=nums.length;
        if(h==1 || nums[0]>=nums[1])
        return 0;
        if(nums[h-1]>=nums[h-2])
        return h-1;
        for(int i=1;i<h-1;i++)
        {
            if(nums[i-1]<=nums[i] && nums[i]>=nums[i+1])
            return i;
        }
        return 0;
    }
}