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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null || head.next == null) return head;

        int n = 0;
        ListNode curr = head;
        ListNode tail = null;
        while(curr != null){
            tail = curr;
            curr = curr.next;
            n++;
        }


        k = k%n;
        //if list is [12345] and k is 5 so k bexcomes 0,
        //so ans becomes [12345] itself
        if (k == 0) return head;
        int steps = (n-k)%n;

        ListNode newTail = head;
        for(int i = 0; i<steps -1; i++){
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;

        tail.next = head;
        return newHead;
    }
}