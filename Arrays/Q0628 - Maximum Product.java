class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int pr=0;
        int sr=0;
        int b=nums.length;
        pr=nums[0]*nums[1]*nums[b-1];
        sr=nums[b-3]*nums[b-2]*nums[b-1];
        if(pr>sr)
        return pr;
        else
        return sr;
    }
}