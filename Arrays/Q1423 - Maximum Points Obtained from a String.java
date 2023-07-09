class Solution {
    public int maxScore(int[] c, int k) {
        int max=0;
        for(int i=0;i<k;i++)
        {
            max+=c[i];
        }
        int res=max;
        for(int i=k-1,j=c.length-1;i>=0;i--,j--)
        {
            max+=c[j]-c[i];
            res=Math.max(res,max);
        }
        return res;
    }
}