class Solution {
    public void moveZeroes(int[] arr) {
        int h=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            arr[h++]=arr[i];
        }
        for(int i=h;i<arr.length;i++)
        {
            arr[h++]=0;
        }
    }
}