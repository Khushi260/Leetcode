class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans_list = new ListNode();
        ListNode curr = ans_list;

        while(list1 != null && list2!=null){
            if(list1.val<list2.val){
                curr.next=list1;
                list1=list1.next;
            }else{
                curr.next=list2;
                list2=list2.next;
            }
             curr=curr.next;
        }

        while(list1!=null){
            curr.next=list1;
            curr=curr.next;
            list1=list1.next;
        }

        while(list2!=null){
            curr.next=list2;
            curr=curr.next;
            list2=list2.next;
        }

        return ans_list.next;
    }
}
Console
