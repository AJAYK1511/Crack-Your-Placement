class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> st=new HashSet<Integer>();
        int h=0;
        for(int i=0;i<nums.length;i++)
        {
            if(st.contains(nums[i]))
            {
                h=nums[i];
                break;
            }
            else
            st.add(nums[i]);
        }
        return h;
    }
}