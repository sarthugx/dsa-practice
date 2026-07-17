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

    public ListNode reverse (ListNode head){
        ListNode curr = head;
        ListNode prev = null;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}