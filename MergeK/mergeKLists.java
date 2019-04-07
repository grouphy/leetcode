package MergeK;
/*
    合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。

    示例:
    输入:
    [
      1->4->5,
      1->3->4,
      2->6
    ]
    输出: 1->1->2->3->4->4->5->6
 */
public class mergeKLists {
    //类似于归并排序
    public ListNode mergeKLists(ListNode[] lists) {
        int len = lists.length;
        if(len == 0) return null;
        return divide(lists,0,lists.length-1);
    }

    public static ListNode divide(ListNode[] lists,int l,int r){
        if(r == l){
            return lists[l];
        }
        int mid = (r - l) / 2 + l;
        ListNode l1 = divide(lists,l,mid);
        ListNode l2 = divide(lists,mid+1,r);
        return merge(l1,l2);
    }
    //合并两个链表
    public static ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode node = dummyHead;
        while(l1!=null && l2!=null){
            if(l1.val>=l2.val){
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

    //暴力法求解，将前两个合并，再和后面每项一一合并
    /*public static void method1(){

        int len = lists.length;
        if(len == 0) return null;
        ListNode dummy = new ListNode(-1);
        dummy.next = lists[0];
        int i = 1;
        while(i<len){
            dummy.next = merge(dummy.next,lists[i]);
            i = i + 1;
        }
        return dummy.next;
    }*/

}
