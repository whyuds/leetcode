import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {

    @Test
    void reverseList() {
        ListNode l0 = new ListNode(1);
        l0.next = new ListNode(2);
        l0.next.next = new ListNode(3);
        l0.next.next.next = new ListNode(4);
        l0.next.next.next.next = new ListNode(5);

        ListNode l1 = new ListNode(5);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(2);
        l1.next.next.next.next = new ListNode(1);

        ListNode l2 = ReverseLinkedList.reverseList(l0);

        assertEquals(l1.val, l2.val);
        assertEquals(l1.next.val, l2.next.val);
        assertEquals(l1.next.next.val, l2.next.next.val);
        assertEquals(l1.next.next.next.val, l2.next.next.next.val);
        assertEquals(l1.next.next.next.next.val, l2.next.next.next.next.val);
    }
}