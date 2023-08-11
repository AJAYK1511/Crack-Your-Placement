class Solution {
    public int maxArea(int[] nums) {
        int a=0,b=nums.length-1,val=0,c=nums.length-1;
        while(a<b)
        {
            int res;
            if(nums[a]>=nums[b])
            {
                res=nums[b]*(c);
                b--;
            }
            else
            {
                res=nums[a]*(c);
                a++;
            }
            c--;
            if(res>val)
            val=res;
        }
        return val;
    }
}