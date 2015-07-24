package deleteNodeInALinkedList;

import common.ListNode;

/**
 * Write a function to delete a node (except the tail) in a singly linked list,
 * given only access to that node.
 * 
 * Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node
 * with value 3, the linked list should become 1 -> 2 -> 4 after calling your
 * function.
 * 
 * 本题题意是：删除当前给定的节点 = =！
 */
public class myAnswer {
	public void deleteNode(ListNode node) {
		if (node == null)
			return;
		node.val = node.next.val;
		node.next = node.next.next;
	}
}