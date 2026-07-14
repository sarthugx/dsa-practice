/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // Set <Integer>set = new HashSet<>();

        // ListNode ptr = head;
        // while(ptr.next != null){
        //     if(set.contains(ptr.val)){
        //         return true;
        //     }
        //     ptr = ptr.next;
        // }

        // return false;

        //this doesnt works because what if list has duplicates?? huh
        //but instead of values if we stored their addresses it works 
        //but still the sapce comp is O(n)
        //we can bring it to O(1)

        

        ListNode slow = head;
        ListNode fast = head;

        while(slow != null && fast != null && fast.next != null){
            
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;


    }
}