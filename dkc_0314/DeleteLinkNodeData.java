package dkc_0314;
/**
 *
 * @author dell
 *删除链表元素
 */
class ListNode{
	Object data;
	ListNode next;
	public ListNode(Object data) {
		this.data = data;
	}
	
}

public class DeleteLinkNodeData {
	
	public static void main(String[] args) {
		ListNode dummyHead = new ListNode(-1);
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		dummyHead.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = null;
		ListNode head = deleteLinkNodeData(node1, 2);
		while(head!=null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
	
	public static ListNode deleteLinkNodeData(ListNode head,Object data) {
		if(head == null) return null; 
		if(head.data == data) head = head.next;
		ListNode prev = head;
		while(prev.next!=null) {
			if(prev.next.data == data) {
				prev.next = prev.next.next;
			}else {
				prev = prev.next;
			}
		}
		return head;
	}
}
