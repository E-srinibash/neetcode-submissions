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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode(-1);
        ListNode tail = temp;

        ListNode it1 = list1;
        ListNode it2 = list2;

        while( it1 != null && it2 != null){
           if(it1.val <= it2.val){
            tail.next = new ListNode(it1.val);
            it1 = it1.next;
           }
           else{
            tail.next = new ListNode(it2.val);
            it2 = it2.next;
           }
           tail = tail.next;
        }
        while(it1 != null){
            tail.next = new ListNode(it1.val);
            tail = tail.next;
            it1 = it1.next;
        }
        while(it2 != null){
            tail.next = new ListNode(it2.val);
            tail = tail.next;
            it2 = it2.next;
        }
        return temp.next;
    }
}