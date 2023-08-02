class Solution {
    public boolean isPowerOfTwo(int n) {
        int j=0;
         for(int i=0;i<31;i++)
         {
             if(Math.pow(2,i)==n)
             {
                 j++;
             }
         }
         if(j==0)
         return false;
         else
         return true;
    }
}