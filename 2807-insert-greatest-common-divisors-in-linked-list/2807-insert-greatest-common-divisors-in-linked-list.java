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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next==null) return head;
        ListNode temp=head;
        while(temp.next!=null){
            int value=gcd(temp.val,temp.next.val);
            ListNode gd=new ListNode(value);
            
            ListNode tempa=temp.next;
            temp.next=gd;
            gd.next=tempa;
            
            temp=temp.next.next;
        }
        return head;
    }
     private int gcd(int a, int b) {
        while(a != b) {
            if(a > b) a -= b;
            else b -= a;
        }
        return a;
    }
    
}


