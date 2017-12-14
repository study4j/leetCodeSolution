package com.ding.algotithms.easy;

import java.util.Objects;

/*

21. Merge Two Sorted Lists
*
* Merge two sorted linked lists and return it as a new list.
* The new list should be made by splicing together the nodes of the first two lists.
* */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (Objects.isNull(l1)) {
            return l2;
        }
        if (Objects.isNull(l2)) {
            return l1;
        }

        if (l1.val <= l2.val) {
            l1.next = new MergeTwoSortedLists().mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = new MergeTwoSortedLists().mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    public static void main(String[] args) {

    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
