class Solution {
    public int strStr(String haystack, String needle) {
        int d=-1;
        int b=needle.length();
        int a=haystack.length();
        for(int i=0;i<=a-b;i++)
        {
            String sd=haystack.substring(i,i+b);
            if(sd.equals(needle))
            {
                d=i;
                break;
            }
        }
        return d;
    }
}
