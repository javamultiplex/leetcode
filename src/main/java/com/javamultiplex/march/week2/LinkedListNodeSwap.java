package com.javamultiplex.march.week2;

import com.javamultiplex.march.week2.List.ListNode;

/**
 * @author Rohit Agarwal on 14/03/21 4:12 pm
 * @copyright www.javamultiplex.com
 */
public class LinkedListNodeSwap {

    public static ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        ListNode begin = new ListNode();
        int count = 0;
        while (temp != null) {
            count++;
            if (count == k) {
                begin = temp;
            }
            temp = temp.next;
        }
        int n = count;
        temp = head;
        ListNode end = new ListNode();
        count = 0;
        while (temp != null) {
            count++;
            if (count == n - k + 1) {
                end = temp;
                break;
            }
            temp = temp.next;
        }

        int t = begin.val;
        begin.val = end.val;
        end.val = t;

        return head;
    }

}
