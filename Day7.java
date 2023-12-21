class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode start = new ListNode();
		start.next = head;

		// Runners
		ListNode slow = start;
		ListNode fast = start;

		for (int i = 1; i <= n; i++) {
			fast = fast.next;
		}

		// Runner technique
		while (fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}

		// Delete Nth Node from End of List reference using previous node
		slow.next = slow.next.next;
		return start.next;
	}
 
    }
