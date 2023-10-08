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
    public boolean isPalindrome(ListNode head) {
        if(head.next == null){
            return true;
        }
        //reverse
        ListNode current = head;
        ListNode next = null;
        ListNode prev = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        ListNode prev2 = prev;
        ListNode current2 = head;
        while(current2 != null){
            if(current2.val != prev2.val){
                return false;
            }
            current2 = current2.next; 
            prev2 = prev2.next;
        }
        return true;
        
    }
}
