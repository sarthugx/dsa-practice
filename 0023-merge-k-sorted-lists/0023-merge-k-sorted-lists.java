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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null;

        return mergeKListHelper(lists, 0, lists.length -1);
    }

    private ListNode mergeKListHelper(ListNode[] lists, int start, int end){
        if( start == end ) return lists[start];

        //left and right merging
        if (start + 1 == end){
            return merge2Lists(lists[start], lists[end]);
        }
        
        //Binary search//left and right breaking
        int mid = start + (end - start) /2;
        ListNode left = mergeKListHelper(lists, start, mid);
        ListNode right = mergeKListHelper(lists, mid+1, end);
        //left and right merging
        return merge2Lists (left, right);

    }

    private ListNode merge2Lists(ListNode l1, ListNode l2){
        ListNode temp = new ListNode(-1);
        ListNode head = temp;

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                temp.next = l1;
                l1 = l1.next;
            }else{
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        
        if(l1 == null){
            temp.next = l2;
        }else if(l2 == null){
            temp.next = l1;
        }

        return head.next;

    }

}