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

/**
 * @author Grace Hanson
 * @date 6-13-2025
 * @description Merges two sorted linked lists and returns it as a new sorted
 *              list.
 *              The new list is made by splicing together the nodes of the first
 *              two lists.
 *              Time Complexity: O(n + m) where n and m are the lengths of the
 *              two lists.
 *              Space Complexity: O(1) since we are not using any extra space
 *              except for a few pointers.
 *
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode tempNode = new ListNode(0);
        ListNode currentNode = tempNode;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                currentNode.next = list1;
                list1 = list1.next;
            } else {
                currentNode.next = list2;
                list2 = list2.next;
            }

            currentNode = currentNode.next;
        }

        if (list1 != null) {
            currentNode.next = list1;
            list1 = list1.next;
        }
        if (list2 != null) {
            currentNode.next = list2;
            list2 = list2.next;
        }

        return tempNode.next;

    }
}