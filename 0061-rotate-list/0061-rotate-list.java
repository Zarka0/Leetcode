class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;

        // Calculate the length of the list
        ListNode current = head;
        int length = 1;  // Start with 1 since we're at the head
        while (current.next != null) {
            length++;
            current = current.next;
        }
        ListNode last = current;  // This is the last node

        // Normalize k
        k = k % length;
        if (k == 0) return head;

        // Find the new tail (at position length - k - 1)
        ListNode newTail = head;
        for (int i = 1; i < length - k; i++) {
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;

        // Adjust pointers to rotate the list
        newTail.next = null;
        last.next = head;

        return newHead;
    }
}
