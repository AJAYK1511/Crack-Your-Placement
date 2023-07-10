class Solution {
    public int maxProfit(int[] prices) {
        int a=prices.length;
        if(prices==null || a==0)
        return 0;
        int sum=0;
        for(int i=1;i<a;i++)
        {
            if(prices[i-1]<prices[i])
            sum+=prices[i]-prices[i-1];
        }
        return sum;
    }
}