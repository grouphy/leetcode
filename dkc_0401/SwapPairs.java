package dkc_0401;

public class SwapPairs {
	 public ListNode swapPairs(ListNode head) {
	        if(head == null || head.next == null) return head;
	        ListNode dummyHead = new ListNode(-1);
	        dummyHead.next = head;
	        ListNode cur = dummyHead;
	        ListNode f = head;
	        ListNode s = f.next;
	        while(s!=null){
	            f.next = s.next;
	            s.next = cur.next;
	            cur.next = s;
	            s = f.next;
	            //这一步还是很重要的
	            if(s == null) break;
	            cur = f;
	            f = s;
	            s = f.next;
	        }
	        return dummyHead.next;
	    }
}
