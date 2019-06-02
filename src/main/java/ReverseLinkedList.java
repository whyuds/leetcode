import java.util.List;

/**
 * 反转一个单链表。
 *
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 * @author wangy
 */
public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        ListNode newHead = head.next;
        head.next = null;
        ListNode revedNewNode = reverseList(newHead);
        if(revedNewNode != null){
            ListNode tmpNode = revedNewNode;
            while(tmpNode.next != null){
                tmpNode = tmpNode.next;
            }
            tmpNode.next = head;
            return revedNewNode;
        }else{
            return head;
        }
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
