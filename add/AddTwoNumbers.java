package add;

/**
 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，
 并且它们的每个节点只能存储 一位 数字。

 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。

 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。

 示例：

 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 输出：7 -> 0 -> 8
 原因：342 + 465 = 807
 */
public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1,ListNode l2) {
        int len1 = getLength(l1);
        int len2 = getLength(l2);
        int c = 0;
        //定义虚拟头结点
        ListNode dummy = new ListNode(-1);
        //定义标记结点
        ListNode sign = dummy;
        //判断两链表长度，将短链表向长链表上加
        if(len2>=len1){
            //虚拟结点指向长链表头结点
            dummy.next = l2;
            while(l1!=null){
                int add = l1.val+l2.val+c;
                int t = add/10;
                int mod = add%10;
                if(t == 0){
                    l2.val = add;
                    c = 0;
                }else{
                    l2.val = mod;
                    c = t;
                }
                l1 = l1.next;
                l2 = l2.next;
                sign = sign.next;
            }
            //对长链表剩余的值和进位c进行加法运算
            while(l2!=null){
                int add = l2.val + c;
                int t = add/10;
                int mod = add%10;
                if(t == 0){
                    l2.val = add;
                    c = 0;
                }else{
                    l2.val = mod;
                    c = t;
                }
                sign = sign.next;
                l2 = l2.next;
            }
        }else{
            //虚拟结点指向长链表头结点
            dummy.next = l1;
            while(l2!=null){
                int add = l1.val+l2.val+c;
                int t = add/10;
                int mod = add%10;
                if(t == 0){
                    l1.val = add;
                    c = 0;
                }else{
                    l1.val = mod;
                    c = t;
                }
                l1 = l1.next;
                l2 = l2.next;
                sign = sign.next;
            }
            //对长链表剩余的值和进位c进行加法运算
            while(l1!=null){
                int add = l1.val + c;
                int t = add/10;
                int mod = add%10;
                if(t == 0){
                    l1.val = add;
                    c = 0;
                }else{
                    l1.val = mod;
                    c = t;
                }
                l1 = l1.next;
                sign = sign.next;
            }
        }
        //加完后如果进位等于1，则新建结点，让长链表最后一个结点指向新建结点，新建结点指向空
        if(c == 1){
            ListNode node= new ListNode(1);
            sign.next = node;
            node.next = null;
        }
        return dummy.next;
    }
    //获取链表长度
    public static int getLength(ListNode head){
        int count = 0;
        ListNode cur = head;
        while(cur!=null){
            cur =cur.next;
            count++;
        }
        return count;
    }
}
