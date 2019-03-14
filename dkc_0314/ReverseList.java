package dkc_0314;
/*
 	反转一个单链表。
	示例:
	输入: 1->2->3->4->5->NULL
	输出: 5->4->3->2->1->NULL
 */
class Node{
	Object data;
	Node next;
	public Node(Object data) {
		this.data = data;
	}
}

public class ReverseList {
	
	//三指针解决
	public static Node reverseList(Node head) {
		//定义虚拟头结点
		Node dummyHead = new Node(-1);
		dummyHead.next = head;
		if(head == null || head.next == null) {
			return head;
		}else {
			//定义f，s分别指向第一个结点和第二个结点
			Node f = dummyHead.next;
			Node s = f.next;
			while(s != null) {
				f.next = s.next;
				s.next = dummyHead.next;
				dummyHead.next = s;
				s = f.next;
			}
			return dummyHead.next;
		}
	}
	
}

