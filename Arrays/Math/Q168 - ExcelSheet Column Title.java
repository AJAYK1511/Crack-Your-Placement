class Solution {
    public String convertToTitle(int c) {
        StringBuilder fd=new StringBuilder();
        while(c>0)
        {
            --c;
            int d=c%26;
            c=c/26;
            fd.append((char)('A'+d));
        }
        fd.reverse();
        return fd.toString();
    }
}