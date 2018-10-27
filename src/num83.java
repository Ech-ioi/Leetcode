public class num83 {
}

//Definition for singly-linked list.


class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return head;
        ListNode node=head;
        head=node;
        while(node.next!=null&&node!=null){
            while(node.val==node.next.val){
                if(node.next.next!=null)
                    node.next=node.next.next;
                else
                    node.next=null;
            }
            node=node.next;
        }
        return head;
    }
}