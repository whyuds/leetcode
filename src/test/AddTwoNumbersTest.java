import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {

    @Test
    public void addTwoNumbers1() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode l3 = AddTwoNumbers.addTwoNumbers(l1 ,l2);
        assertEquals(7, l3.val);
        assertEquals(0, l3.next.val);
        assertEquals(8, l3.next.next.val);
    }
}