class Solution {
    public int maxProduct(int[] nums) {
        int val=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            int g=nums[i];
            for(int j=i+1;j<nums.length;j++)
            {
                val=Math.max(val,g);
                g*=nums[j];
            }
            val=Math.max(val,g);
        }
        return val;
    }
}
