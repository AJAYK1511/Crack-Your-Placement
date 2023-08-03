class Solution {
    public int kthFactor(int n, int k) {
        int d=0,sd=-1;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                d++;
            }
                    if(d==k)
                    {
                       sd=i;
                       break;
                    }
        }
        return sd;
    }
}