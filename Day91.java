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
    public ListNode mergeNodes(ListNode head) {
        // Create two pointers
        ListNode temp = head;
        ListNode p = head.next;

        // Run a loop till p == null
        while(p != null) {
            // create a variable to store the sum of node values between two zeros
            int sum = 0;

            // run a loop to sum values of nodes
            while(p.val != 0) {
                sum += p.val;
                p = p.next;
            }

            // create newNode with sum value and add it to linked list
            ListNode newNode = new ListNode(sum);
            temp.next = newNode;
            temp = temp.next;
            
            p = p.next;
        }
        // return head.next because we don't need first node of head which is zero
        return head.next;
    }
}