package dkc_0316;

public class DeleteTarget {
	
	public static ListNode deleteTarget(ListNode head,int val) {
		ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode prev = dummyHead;
        while(prev.next!=null){
            if(prev.next.data == val){
                prev.next = prev.next.next;
            }else{
                prev = prev.next;
            }
        }
        return dummyHead.next;
	}
}
