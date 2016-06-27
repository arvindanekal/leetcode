/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode result = null;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                if(result == null) {result = l1;head = l1;}
                else{
                result.next = l1;
                result = l1;
                }
                l1 = l1.next;
            }else{
                if(result == null) {result = l2;head = l2;}
                else{
                result.next = l2;
                result = l2;
                }
                l2 = l2.next;
            }
        }
        while(l1!=null){
            if(result == null) {result = l1;head = l1;}
                else{
                result.next = l1;
                result = l1;
                }
                l1 = l1.next;
        }
        while(l2!=null){
            if(result == null) {result = l2;head = l2;}
                else{
                result.next = l2;
                result = l2;
                }
                l2 = l2.next;
        }
        return head;
        
    }
}
