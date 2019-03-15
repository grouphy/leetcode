package dkc_0315;

public class MergeTwoLists {
	public static ListNode mergeTwoLists(ListNode l1,ListNode l2) {
		 ListNode dummyHead = new ListNode(0);
	        ListNode node = dummyHead;
	        while(l1!=null && l2!=null){
	            if(l1.data >= l2.data){
	                node.next = l2;
	                l2 = l2.next;
	            }else{
	                node.next = l1;
	                l1 = l1.next;
	            }
	            node = node.next;
	        }
	        
	        if(l1==null){
	            node.next = l2;
	            
	        }
	        if(l2==null){
	            node.next = l1;
	        }
	        return dummyHead.next;
	}
}
