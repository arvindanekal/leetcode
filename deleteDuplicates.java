/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while(temp!=null && temp.next!=null){
            ListNode next = temp.next;
            if(temp.val == next.val){
                temp.next = next.next;
            }else{
                temp = next;
            }
            
        }
        return head;
    }
}
