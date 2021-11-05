/**
 * @Description:
 * @Version: V1.0
 * @Author: focus.guo@happyeasygo.com
 * @Date: 2021/11/5 11:08
 */


public class N002 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean carry = false;
        ListNode resultNode = new ListNode();
        ListNode node = new ListNode();
        resultNode = node;
        do {
            int result = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val);
            if (carry) {
                result++;
            }
            if (result >= 10) {
                result = result % 10;
                carry = true;
            } else {
                carry = false;
            }

            node.val = result;

            ListNode nextNode = new ListNode();

            l1 = (l1 == null ? null : l1.next);
            l2 = (l2 == null ? null : l2.next);

            if (l1 == null && l2 == null && !carry) {
                nextNode = null;
            } else {
                node.next = nextNode;
                node = nextNode;
            }

        }
        while (l1 != null || l2 != null || carry);

        return resultNode;
    }

    public static void main(String[] args) {

    }
}
