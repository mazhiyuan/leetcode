/**
 * 
 */
package zhiyuan.leetcode;

/**
 * @author mazhiyuan
 * @version Given a sorted linked list, delete all duplicates such that each
 *          element appear only once.
 * 
 *          For example, Given 1->1->2, return 1->2. Given 1->1->2->3->3, return
 *          1->2->3.
 */
class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class Remove_Duplicates_from_Sorted_List {
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

		for (ListNode i = head; i.next != null;) {
			if (i.val == i.next.val)
				i.next = i.next.next;
			else
				i = i.next;
		}
		return head;
	}
}
