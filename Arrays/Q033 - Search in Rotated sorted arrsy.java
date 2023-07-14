class Solution {
    public int search(int[] nums, int target) {
        int k=-1,g=0;
            for(int i=0;i<nums.length-1;i++)
            {
                if(nums[i]>nums[i+1])
                {
                g=i+1;
                break;
                }
            }
        if(target<nums[0])
        {
            for(int i=g;i<nums.length;i++)
            {
                if(nums[i]==target)
                {
                k=i;
                break;
                }
            }
        }
        else 
        {
            if(g!=0)
            {
            for(int i=0;i<g;i++)
            {
                if(nums[i]==target)
                {
                k=i;
                break;
                }
            }
            }
            else
            {
               for(int i=0;i<nums.length;i++)
                {
                if(nums[i]==target)
                {
                k=i;
                break;
                }
                } 
            }
        }
         return k;
    }
}