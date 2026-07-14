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
        ListNode temp = head;
        int count = 0;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        int nFromStart = count-n;
        if(nFromStart == 0){
            return head.next;
        }
        temp = head;
        count = 1;
        while(count<nFromStart){
            temp = temp.next;
            count++;
        }
        if(temp!=null && temp.next!=null){
        temp.next = temp.next.next;
        }
        return head;
    }
}
