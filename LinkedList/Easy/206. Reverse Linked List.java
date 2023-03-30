class Solution {
    public ListNode reverseList(ListNode head) {
       ListNode curr = head;
       ListNode prev = null;

       while(curr!=null){
           ListNode after = curr.next;

           curr.next=prev; //to reverse the pointer

           prev=curr; //update the prevoius node

           curr=after;
        }
        head=prev;
        return head;

    }
}
