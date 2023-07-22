class Solution {
    public boolean check(int a,int b,String s)
    {
        while(a<b)
        {
            if(s.charAt(a)!=s.charAt(b))
                return false;
            a++;
            b--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int a=0,b=s.length()-1;
        while(a<b  && s.charAt(a)==s.charAt(b))
        {
              a++;
              b--;
        }
        return check(a+1,b,s)||check(a,b-1,s);
    }
}