class Solution
{
    public boolean findPair(int arr[], int size, int n)
    {
        int b=0;
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(Math.abs(arr[i]-arr[j])==n)
                {
                    b=1;
                    break;
                }
            }
            if(b==1)
            break;
        }
        if(b==1)
        return true;
        else
        return false;
        //code here.
    }
}
