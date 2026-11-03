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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode itr = head;
        int carry = 0;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + carry;
            carry = sum > 9 ? 1 : 0;
            sum = sum % 10;
            itr.next = new ListNode(sum);
            itr = itr.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l1 != null) {
            while (l1 != null && carry > 0) {
                int sum = l1.val + carry;
                carry = sum > 9 ? 1 : 0;
                sum = sum % 10;
                itr.next = new ListNode(sum);
                itr = itr.next;
                l1 = l1.next;
            }
            if (l1 != null) {
                itr.next = l1;
            }
        }
        if (l2 != null) {
            while (l2 != null && carry > 0) {
                int sum = l2.val + carry;
                carry = sum > 9 ? 1 : 0;
                sum = sum % 10;
                itr.next = new ListNode(sum);
                itr = itr.next;
                l2 = l2.next;
            }
            if (l2 != null) {
                itr.next = l2;
            }
        }
        if (carry == 1) {
            itr.next = new ListNode(1);
        }

        return head.next;
    }
}
