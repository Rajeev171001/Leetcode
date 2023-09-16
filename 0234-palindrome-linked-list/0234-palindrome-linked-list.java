/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
     public ListNode reverseList(ListNode head) {
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){ //because we need a node behind middle
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=reverseList(slow.next);
        ListNode start=head;
        ListNode mid=slow.next;
        while(mid!=null){
            if(mid.val!=start.val) return false;
            start=start.next;
            mid=mid.next;
        }
        return true;
        
    }
}