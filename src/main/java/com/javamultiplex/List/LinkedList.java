package com.javamultiplex.List;

import java.util.List;

/**
 * @author Rohit Agarwal on 14/03/21 11:09 pm
 * @copyright www.javamultiplex.com
 */
public class LinkedList {
    private ListNode head;

    public void insert(int element) {
        if (head == null) {
            head = new ListNode(element);
        } else {
            ListNode temp = head;
            ListNode listNode = new ListNode(element);
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = listNode;
        }
    }

    public ListNode insert(List<Integer> list) {
        for (Integer element : list) {
            insert(element);
        }
        return head;
    }


}
