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
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        int count=1;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }
        int half=count/2 + 1;
        ListNode temp1=head;
        while(half-->1){
            temp1=temp1.next;
        }
        return temp1;
    }
}