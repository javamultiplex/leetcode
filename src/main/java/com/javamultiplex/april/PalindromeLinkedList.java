package com.javamultiplex.april;

import com.javamultiplex.List.ListNode;

/**
 * @author Rohit Agarwal on 02/04/21 1:25 pm
 * @copyright www.javamultiplex.com
 */
public class PalindromeLinkedList {

    public static boolean isPalindrome1(ListNode head) {
        int size = size(head);
        int[] arr = new int[size];
        int i = 0;
        while (head != null) {
            arr[i++] = head.val;
            head = head.next;
        }
        int left = 0;
        int right = size - 1;
        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindrome2(ListNode head) {
        ListNode list = copy(head);
        ListNode reverseList = reverse(head);
        while (list != null && reverseList != null) {
            if (list.val != reverseList.val) {
                return false;
            }
            list = list.next;
            reverseList = reverseList.next;
        }
        return true;
    }

    private static ListNode copy(ListNode head) {
        ListNode temp = head;
        ListNode node = null;
        while (temp != null) {
            ListNode listNode = new ListNode(temp.val);
            if (node == null) {
                node = listNode;
            } else {
                ListNode node1 = node;
                while (node1.next != null) {
                    node1 = node1.next;
                }
                node1.next = listNode;
            }
            temp = temp.next;
        }
        return node;
    }

    private static ListNode reverse(ListNode node) {
        ListNode prev = null;
        ListNode current = node;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    private static int size(ListNode head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

}
