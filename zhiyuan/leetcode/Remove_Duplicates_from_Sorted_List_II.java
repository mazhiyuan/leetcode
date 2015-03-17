/**
 *
 */
package zhiyuan.leetcode;

/**
 * @author mazhiyuan
 *         Given a sorted linked list, delete all nodes that have duplicate
 *         numbers, leaving only distinct numbers from the original list.
 *         <p/>
 *         For example, Given 1->2->3->3->4->4->5, return 1->2->5. Given
 *         1->1->1->2->3, return 2->3.
 */
public class Remove_Duplicates_from_Sorted_List_II {
    public ListNode deleteDuplicates_recursion(ListNode head) {
        if (head == null || head.next == null)
            return head;
        if (head.val == head.next.val) {
            head.next = head.next.next;
            deleteDuplicates_recursion(head);
        } else {
            deleteDuplicates_recursion(head.next);
        }
        return head;
    }

    public ListNode deleteDuplicates_iteration(ListNode head) {
        if (head == null || head.next == null)
            return head;

        int value = head.val;
        boolean flag = head.val == head.next.val;
        if (head.next.next == null && flag)
            return null;
        for (ListNode i = head.next; ; ) {
            if (i.val == value) {
                head.next = i.next;
            } else {
                value = i.val;
            }
            if (i.next == null)
                break;

            i = i.next;
        }
        if (flag)
            head = head.next;

        return head;
    }

    public static void main(String args[]) {
        Remove_Duplicates_from_Sorted_List_II r = new Remove_Duplicates_from_Sorted_List_II();
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(3);
        ListNode l5 = new ListNode(6);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
//		l4.next = l5;
        ListNode r1 = r.deleteDuplicates_iteration(l1);
        System.out.print(r1);
    }
}
