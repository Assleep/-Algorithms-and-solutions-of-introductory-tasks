/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 * Examples:
 *  Input: [] []
 *  Output: []
 *
 *  Input: [1, 2, 4] [3, 2, 5]
 *  Output: [1, 2, 2, 3, 4, 5]
 *
 *  Input: [0] []
 *  Output: [0]
*/
public class MergeTwoSortedListsSolution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }

        if (l1 == null && l2 != null) {
            return l2;
        }

        if (l1 != null && l2 == null) {
            return l1;
        }

        ListNode mergedHigh = null, mergedLow = null, current = null, tmpNode1 = l1, tmpNode2 = l2;

        while (tmpNode1 != null && tmpNode2 != null) {
            if (tmpNode1.val <= tmpNode2.val) {
                current = new ListNode(tmpNode1.val);
                tmpNode1 = tmpNode1.next;
            }
            else {
                current = new ListNode(tmpNode2.val);
                tmpNode2 = tmpNode2.next;
            }

            if (mergedHigh == null) {
                mergedHigh = current;
                mergedLow = mergedHigh;
            }
            else {
                mergedLow.next = current;
                mergedLow = mergedLow.next;
            }
        }

        while (tmpNode1 != null) {
            mergedLow.next = tmpNode1;
            mergedLow = mergedLow.next;

            tmpNode1 = tmpNode1.next;
        }

        while (tmpNode2 != null) {
            mergedLow.next = tmpNode2;
            mergedLow = mergedLow.next;

            tmpNode2 = tmpNode2.next;
        }

        return mergedHigh;
    }
}
