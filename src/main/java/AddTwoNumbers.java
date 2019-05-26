/**
 * @author wangyudong
 */
public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean needAdd = false;
        return addTwoNumbers(l1, l2, needAdd);
    }

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2, boolean needAdd){
        ListNode l3 = null;
        if(l1 == null && l2 == null && !needAdd){
            return null;
        }
        if(l1 == null){
            l1 = new ListNode(0);
        }
        if(l2 == null){
            l2 = new ListNode(0);
        }
        int vart;
        if(needAdd){
            vart = l1.val + l2.val + 1;
        }else{
            vart = l1.val + l2.val;
        }
        if(vart < 10){
            needAdd = false;
        }else{
            vart = vart - 10;
            needAdd = true;
        }
        l3 = new ListNode(vart);
        l3.next = addTwoNumbers(l1.next, l2.next, needAdd);
        return l3;
    }
}
