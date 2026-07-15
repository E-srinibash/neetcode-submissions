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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0,head);
        ListNode temp1 = head;
        ListNode temp2 = dummy;
        
        for(int i = 0;i<n;i++){
            temp1 = temp1.next;
        }
        
        while(temp1 != null){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        temp2.next = temp2.next.next;
        return dummy.next;
    }
}
