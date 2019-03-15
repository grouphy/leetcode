package dkc_0315;
/*
 	给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
	示例 1:
	输入: 1->1->2
	输出: 1->2
	
	示例 2:
	输入: 1->1->2->3->3
	输出: 1->2->3
 */
public class DeleteDuplicates {
	public static ListNode deleteDuplicates(ListNode head) {
		//定义虚拟头结点
		ListNode dummyHead = new ListNode(-1);
		//指向头结点
		dummyHead.next = head;
		//如果链表等于空或者只有一个元素，直接返回链表
		if(head == null || head.next == null) return head;
		//定义标记sign，指向头结点下一个结点
		ListNode sign = head.next;
		//如果不相等的话，让head.next指向sign,然后让head指向sign，sign指向sign下一个结点
		//如果head.data == sign.data ，让sign指向sign下一个结点
		while(sign != null) {
			if(head.data != sign.data) {
				head.next = sign;
				head = sign;
			}
			sign = sign.next;
		}
		head.next = null;
		return dummyHead.next;
	}
}
