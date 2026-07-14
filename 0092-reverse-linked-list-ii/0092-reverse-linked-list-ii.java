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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode (-1);
        dummy.next = head;

        //leftpre is the ptr to remeber where we started and curr is the left
        ListNode leftPre = dummy;
        ListNode curr = head;

        for(int i = 1; i< left; i++){
            leftPre = leftPre.next;
            curr = curr.next;
        }

        //sublistHead is ptr for same work as left pre but opposite
        //to connect the reversed lsit's end at the end
        ListNode sublistHead = curr;

        ListNode preNode = null;

        for(int i =0; i<=right-left; i++){
            ListNode next = curr.next;
            curr.next = preNode;
            preNode = curr;
            curr = next;
        }

        //joining those two
        leftPre.next = preNode;
        sublistHead.next = curr;

        return dummy.next;
    }
}