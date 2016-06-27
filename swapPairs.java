/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode first = head;
        ListNode second = first.next;
        first.next = second.next;
        second.next = first;
        head = second;
        ListNode prev = first;
        while(first.next !=null && first.next.next != null){
            prev = first;
            second = first.next.next;
            first = first.next;
            first.next = second.next;
            second.next = first;
            prev.next = second;
            prev = first;
        }
        return head;
    }
}
