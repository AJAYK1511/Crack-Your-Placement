class Solution {
    public boolean isPalindrome(int x) {
        String a=Integer.valueOf(x);
        String b=a.reverse();
        if(a.equals(b))
        return true;
        else
        return false;
    }
}