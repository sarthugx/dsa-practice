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
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode first = dummy;
        ListNode second = dummy;
        
        //putting second at nth position
        for(int i = 0; i<n; i++){
            second = second.next;
        }

        //moving em together until second reaches end
        while(second.next != null){
            first = first.next;
            second = second.next;
        }

        //removing mid, basically first.next is mid here and first is prev of mid so.
        first.next = first.next.next;

        return dummy.next;
    }
}