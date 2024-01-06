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
        List<Integer> val = new ArrayList();
        while (head != null) {
            val.add(head.val);
            head = head.next;
        }

        for (int i = 0, j = val.size()-1; i < j; i++, j--) { 
            if (val.get(i) != val.get(j)) {
                return false;
            }
        }
        return true;
        
    }
}