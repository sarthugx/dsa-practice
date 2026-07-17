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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null) return head;

        ListNode curr = head;
        ListNode pre = null;

        int c = k;
        while(curr != null && c>0){
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
            c--;
        }

        //Now with this code the lago will try to reverse all pairs of 3 nodes, so if [12345] it will convert it to [32154], now th 45 was not the group of k but still it got reversed

        //so now to solve this issue, we will re reverse the remains of the list
        //since there were no 3 nodes to be reverse so now the c is not zero its still c>0

        if(curr == null && c>0){
            curr = pre ;
            pre = null;
           
            while(curr != null && c>0){
                ListNode next = curr.next;
                curr.next = pre;
                pre = curr;
                curr = next;
            }  
            return pre;
        }

        head.next = reverseKGroup(curr, k);

        head = pre;
        return head;


    }
}