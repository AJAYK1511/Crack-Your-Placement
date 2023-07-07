class Solution {
    public void sortColors(int[] nums) {
        int a=nums.length;
        int c=0,d=0;
        for(int i=0;i<a;i++)
        {
            if(nums[i]==0)
            c++;
            else if(nums[i]==2)
            d++;
        }
        for(int i=0;i<a;i++)
        {
            nums[i]=1;
        }
        for(int i=0;i<c;i++)
        {
            nums[i]=0;
        }
        for(int i=a-1;i>=a-d;i--)
        {
            nums[i]=2;
        }
    }
}