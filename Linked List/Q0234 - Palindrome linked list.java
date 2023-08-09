class Solution {
    public boolean isPalindrome(ListNode head) {
        String a="";
        while(head!=null)
        {
            a+=head.val;
            head=head.next;
        }
        StringBuilder b=new StringBuilder(a);
        b.reverse();
        String c = b.toString();
        if(a.equals(c))
        return true;
        else
        return false;
    }
}