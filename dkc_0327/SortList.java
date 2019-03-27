package dkc_0327;
/*
 	对链表进行排序
 	示例 1:
		输入: 4->2->1->3
		输出: 1->2->3->4
	示例 2:
		输入: -1->5->3->4->0
		输出: -1->0->3->4->5
 */
public class SortList {
	/*
	 	思想：
	 		1.归并排序思想
	 		2.找到中间节点
	 		3.进行归并排序
	 */
	public static ListNode sortList(ListNode head) {
		return head == null ? head:mergeSort(head);
	}
	//归并
	private static ListNode mergeSort(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ListNode s = head;
        ListNode f = head; 
        ListNode sign = null;
        while (f.next != null) {
            sign = s;
            s = s.next;
            f = f.next.next;
        }
        sign.next = null;
        ListNode left = mergeSort(head);
        ListNode right = mergeSort(s);
        return merge(left, right);
    }
	//合并
    public static ListNode merge(ListNode l, ListNode r) {
        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;
        while (l != null && r != null) {
            if (l.val <= r.val) {
                cur.next = l;
                cur = cur.next;
                l = l.next;
            } else {
                cur.next = r;
                cur = cur.next;
                r = r.next;
            }
        }
        if (l != null) {
            cur.next = l;
        }
        if (r != null) {
            cur.next = r;
        }
        return dummyHead.next;
    }
}
