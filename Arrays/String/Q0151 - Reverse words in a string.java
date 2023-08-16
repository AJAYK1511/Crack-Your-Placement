class Solution {
    public String reverseWords(String sa) {
        //sa.trim();
        String s=sa.replaceAll("\\s+"," ").trim();
        String arr[]=s.split(" ");
        String b="";
        System.out.print(arr.length);
        for(int i=arr.length-1;i>=0;i--)
        {
            b+=arr[i];
            if(i!=0)
            {
            b+=" ";
            }
        }
        return b;
    }
}