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
    public ListNode sortList(ListNode head) {
        //merge sort method (O(n log(n)))
        
        if(head == null || head.next == null){
            return head;
        }

        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;

            //therefore when this loop breaks our slow pointer will be at the middle
            //split, 
            //temp will be the end of first half
            //slow will be the start of next half
            //head is start of first half
        }

        temp.next = null;

        ListNode left_side = sortList(head);
        ListNode right_side = sortList(slow);

        return merge(left_side, right_side);
    }

    public ListNode merge(ListNode l1, ListNode l2){

        ListNode sorted_temp = new ListNode(-1);
        ListNode current_node = sorted_temp;

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                current_node.next = l1;
                l1 = l1.next;
            }else{
                current_node.next = l2;
                l2=l2.next;
            }
            current_node = current_node.next;
        }

        //if any remaining
        if(l1 != null){
            current_node.next = l1;
        }

        if(l2 != null){
            current_node.next = l2;
        }

        return sorted_temp.next;
    }
}