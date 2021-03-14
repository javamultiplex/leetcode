package march.week2;

import com.javamultiplex.march.week2.List.LinkedList;
import com.javamultiplex.march.week2.LinkedListNodeSwap;
import com.javamultiplex.march.week2.List.ListNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

/**
 * @author Rohit Agarwal on 14/03/21 10:20 pm
 * @copyright www.javamultiplex.com
 */
public class LinkedListNodeSwapTest {

    @Test
    public void shouldSwapLinkedListNodes() {
        LinkedList list1 = new LinkedList();
        ListNode listNode1 = list1.insert(Arrays.asList(1, 2, 3, 4, 5));
        ListNode output1 = LinkedListNodeSwap.swapNodes(listNode1, 2);
        assertIterableEquals(Arrays.asList(1, 4, 3, 2, 5), ListNode.traverse(output1));

        LinkedList list2 = new LinkedList();
        ListNode listNode2 = list2.insert(Arrays.asList(7, 9, 6, 6, 7, 8, 3, 0, 9, 5));
        ListNode output2 = LinkedListNodeSwap.swapNodes(listNode2, 5);
        assertIterableEquals(Arrays.asList(7, 9, 6, 6, 8, 7, 3, 0, 9, 5), ListNode.traverse(output2));

        LinkedList list3 = new LinkedList();
        ListNode listNode3 = list3.insert(Collections.singletonList(1));
        ListNode output3 = LinkedListNodeSwap.swapNodes(listNode3, 1);
        assertIterableEquals(Collections.singletonList(1), ListNode.traverse(output3));

        LinkedList list4 = new LinkedList();
        ListNode listNode4 = list4.insert(Arrays.asList(1, 2));
        ListNode output4 = LinkedListNodeSwap.swapNodes(listNode4, 2);
        assertIterableEquals(Arrays.asList(2, 1), ListNode.traverse(output4));

        LinkedList list5 = new LinkedList();
        ListNode listNode5 = list5.insert(Arrays.asList(1, 2, 3));
        ListNode output5 = LinkedListNodeSwap.swapNodes(listNode5, 2);
        assertIterableEquals(Arrays.asList(1, 2, 3), ListNode.traverse(output5));

        LinkedList list6 = new LinkedList();
        ListNode listNode6 = list6.insert(Arrays.asList(1, 2));
        ListNode output6 = LinkedListNodeSwap.swapNodes(listNode6, 1);
        assertIterableEquals(Arrays.asList(2, 1), ListNode.traverse(output6));
    }
}
