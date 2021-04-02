package april;

import com.javamultiplex.List.LinkedList;
import com.javamultiplex.List.ListNode;
import com.javamultiplex.april.PalindromeLinkedList;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Rohit Agarwal on 02/04/21 1:31 pm
 * @copyright www.javamultiplex.com
 */
public class PalindromeLinkedListTest {

    @Test
    public void shouldValidateLinkedList_method1() {
        LinkedList list = new LinkedList();
        ListNode listNode = list.insert(Arrays.asList(1, 2, 2, 1));
        assertTrue(PalindromeLinkedList.isPalindrome1(listNode));

        LinkedList list1 = new LinkedList();
        ListNode listNode1 = list1.insert(Arrays.asList(1, 2));
        assertFalse(PalindromeLinkedList.isPalindrome1(listNode1));

    }

    @Test
    public void shouldValidateLinkedList_method2() {
        LinkedList list = new LinkedList();
        ListNode listNode = list.insert(Arrays.asList(1, 2, 2, 1));
        assertTrue(PalindromeLinkedList.isPalindrome2(listNode));
        LinkedList list1 = new LinkedList();
        ListNode listNode1 = list1.insert(Arrays.asList(1, 2));
        assertFalse(PalindromeLinkedList.isPalindrome2(listNode1));
        LinkedList list2 = new LinkedList();
        ListNode listNode2 = list2.insert(Arrays.asList(1, 1, 2, 1));
        assertFalse(PalindromeLinkedList.isPalindrome2(listNode2));
    }

}
