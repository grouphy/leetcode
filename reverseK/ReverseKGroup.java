package reverseK;

public class ReverseKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null) return head;
        int len = getLength(head);
        int t = len/k;
        ListNode dummy = new ListNode(-1);
        ListNode sign = dummy;
        dummy.next = head;
        ListNode f = head;
        ListNode s = f.next;
        while(t>0){
            int m = k;
            while(m>1&&f!=null){
                f.next = s.next;
                s.next = sign.next;
                sign.next = s;
                s = f.next;
                m--;
            }
            sign = f;
            f = s;
            if(f == null) break;
            s = s.next;
            t--;
        }
        return dummy.next;
    }

    public static int getLength(ListNode head){
        ListNode cur = head;
        int count = 0;
        while(cur!=null){
            cur = cur.next;
            count++;
        }
        return count;
    }
}
