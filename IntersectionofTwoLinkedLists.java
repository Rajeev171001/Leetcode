public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA=headA;
        ListNode tempB=headB;
        //length of list A
        int lenA=0;
        while(tempA!=null){
            lenA++;
            tempA=tempA.next;
        }

        //length of list B
        int lenB=0;
        while(tempB!=null){
            lenB++;
            tempB=tempB.next;
        }

        //difference betwee bith list
        int diff=Math.abs(lenA-lenB);

        //Iterate on larger list for diff
        tempA=headA;
        tempB=headB;
        if(lenA>lenB){
            while(diff-->0){
                tempA=tempA.next;
            }
        }else{
            while(diff-->0){
                tempB=tempB.next;
            }
        }

        //checking for intersection
        while(tempA!=tempB){
            tempA=tempA.next;
            tempB=tempB.next;
            if(tempA==null || tempB==null) return null;
        }
        return tempA;
    }
}
