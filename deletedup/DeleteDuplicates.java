package deletedup;

/**
 * 给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中 没有重复出现 的数字。
 *
 * 示例 1:
 *
 * 输入: 1->2->3->3->4->4->5
 * 输出: 1->2->5
 * 示例 2:
 *
 * 输入: 1->1->1->2->3
 * 输出: 2->3
 */
public class DeleteDuplicates {

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        //虚拟头结点
        ListNode dummy = new ListNode(-1);
        //标记结点
        ListNode sign = dummy;
        dummy.next = head;
        //当前结点
        ListNode cur = head;
        while(cur!=null){
            ListNode np = cur.next;
            int count = 0;
            while(np!=null){
                if(np.val == cur.val){
                    np = np.next;
                    count++;
                }else{
                    break;
                }
            }
            //判断第一个结点是否重复
            if(count>=1 && cur == head){
                sign.next = np;
                dummy = sign;
                cur = np;
            }
            //第一个结点不重复
            else if(count>=1){
                sign.next = np;
                cur = np;
            }
            //当前遍历没有重复结点
            else{
                sign = sign.next;
                cur = cur.next;
            }

        }
        return dummy.next;
    }

}
