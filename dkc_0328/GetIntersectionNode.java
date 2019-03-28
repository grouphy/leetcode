package dkc_0328;
/*
 	两个链表相交的第一个结点
 */
public class GetIntersectionNode {
	public static ListNode getIntersectionNode(ListNode l1,ListNode l2) {
		int len1 = 0;
        int len2 = 0;
        ListNode p1 = l1;
        ListNode p2 = l2;
        //l1的长度
        while(l1 != null){
            len1++;
            l1 = l1.next;
        }
        //l2的长度
        while(l2 != null){
            len2++;
            l2 = l2.next;
        }
        //让大的长度先向后移动Math.abs(len1-len2)
        if(len1>len2){
            for(int i = len1 - len2;i>0;i--)
                p1 = p1.next;
        }else{
            for(int i = len2 - len1;i>0;i--)
                p2 = p2.next;
        }
        //然后比较p1和p2是否相等
        while(p1!=null){
            if(p1 == p2){
                return p1;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return null;
	}
}
