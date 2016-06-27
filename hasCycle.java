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
        if(head == null) return false;
        ListNode torto = head;
        ListNode hare = head.next;
        if(hare == null || hare.next == null) return false;
        hare = hare.next;
        while(torto != null){
            if(torto.val == hare.val) return true;
            torto = torto.next;
            hare = hare.next;
            if(hare == null || hare.next == null) return false;
                hare = hare.next;
        }
        return false;
    }
}
