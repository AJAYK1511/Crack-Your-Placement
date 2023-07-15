class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        Set<Integer> st=new HashSet<>();
        st.add(find(p1,p2));
        st.add(find(p1,p3));
        st.add(find(p1,p4));
        st.add(find(p2,p3));
        st.add(find(p2,p4));
        st.add(find(p3,p4));
        if(!st.contains(0) && st.size()==2)
        return true;
        else
        return false;
    }
        public int find (int a[],int b[])
        {
             return (a[0]-b[0])*(a[0]-b[0])+(a[1]-b[1])*(a[1]-b[1]);
        }
}