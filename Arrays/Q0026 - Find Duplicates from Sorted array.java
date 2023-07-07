class Solution {
    public int removeDuplicates(int[] nums) {
       int h=nums.length;
       int arr[]=new int[h];
       int j=0;
       for(int i=0;i<h-1;i++)
       {
           if(nums[i]!=nums[i+1])
           {
                arr[j++]=nums[i];
           }
       }
       arr[j++]=nums[h-1];
       for(int i=0;i<j;i++)
       {
           nums[i]=arr[i];
       }
       return j;
    }
}
