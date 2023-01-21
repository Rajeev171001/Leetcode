class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode small=new ListNode(0);
        ListNode high=new ListNode(0);

        ListNode smallhead=small, highhead=high;
        while(head!=null){
            if(head.val<x){
                smallhead.next=head;
                smallhead=smallhead.next;
            }else{
                highhead.next=head;
                highhead=highhead.next;
            }
            head=head.next;

        }
        highhead.next=null;
        smallhead.next=high.next;

        return small.next;
    }
}
