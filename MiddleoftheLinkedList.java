class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        int count=1;
        
        while(temp.next!=null){
            count+=1;
            temp=temp.next;
        }
        int half=count/2 + 1 ;
        
        while(half-->1){
            head=head.next;
        
        }
        return head ;

    }
}
