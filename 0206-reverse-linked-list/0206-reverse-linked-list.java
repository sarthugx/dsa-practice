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
    public ListNode reverseList(ListNode head) {
        
        
        // //method 1 : Stack
        // Stack<Integer> value = new Stack<>();
        // while(head != null){
        //     value.push(head.val);
        //     head = head.next;
        // }

        // ListNode reverseList = new ListNode(-1);
        // ListNode ptr = reverseList;

        // while(!value.isEmpty()){
        //     ptr.next = new ListNode (value.pop());
        //     ptr = ptr.next;
        // }
        // return reverseList.next;


        //method 2: flipping the ptr of LL
        
        if(head == null){
            return null;
        }

        if(head.next == null){
            return head;
        }

        ListNode preNode = null;
        ListNode currNode = head;

        while(currNode != null){
            ListNode nextNode = currNode.next;
            currNode.next = preNode;
            preNode = currNode;
            currNode = nextNode;
        }

        head = preNode;
        return head;


        
        //method 1 and 2 is for iterative wway

        //for recursive way
        // if(head.next == null) return;

        // reverseList(head.next);

        // System.out.println(head.val);
    }
}