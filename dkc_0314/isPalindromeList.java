package dkc_0314;


/*
 	请判断一个链表是否为回文链表。
	示例 1:
	输入: 1->2
	输出: false
	
	示例 2:
	输入: 1->2->2->1
	输出: true
 */
class ListNode1{
	Object data;
	ListNode1 next;
	public ListNode1(Object data) {
		this.data = data;
	}
	
}
public class isPalindromeList {
	
	
	public static boolean isPalindrome(ListNode1 head) {
		//为空或者1个，直接返回true
		if(head == null || head.next == null) {
			return true;
		}
		//利用快慢指针找到中点
		ListNode1 fast = head;
		ListNode1 slow = head;
		while(fast!=null&&fast.next!=null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		slow = reverse(slow.next);
		while(slow!=null) {
			if(slow.data != head.data) {
				return false;
			}
			head = head.next;
			slow = slow.next;
		}
		return true;
	}
	
	public static ListNode1 reverse(ListNode1 head) {
		if(head == null) {
			return head;
		}
		ListNode1 newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
	}
}
