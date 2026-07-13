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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode returnNode = new ListNode(-1);

        ListNode headNode = returnNode;

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                returnNode.next = l1;
                l1 = l1.next;
            }else{
                returnNode.next = l2;
                l2 = l2.next;
            }
            returnNode = returnNode.next;
            //in the beginning where we started this retNode at -1, here we just moved it to the next to save further nodes
        }

        //rmeaining list (if any)
        if(l1 == null){
            returnNode.next = l2;
        }else if(l2 == null){
            returnNode.next = l1;
        }

        return headNode.next;
        //since we pointed headNode at the 1st value of  our new list, here we pointed the head of our node to the next value instead of -1, cause we only took -1 as a node to initiate the list, after its remnoval we dont give a fuck about what happens to it, thanks to java's automatic garbage collection, good stuff 
    }
}