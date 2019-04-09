package dkc_flatten;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-09
 * Time:9:02
 */
public class Flatten {
    public Node flatten(Node head) {
        Node cur = head;
        while(cur!=null){
            if(cur.child!=null){
                Node child = cur.child;
                Node sign = child;
                while(child.next!=null){
                    child = child.next;
                }
                //结尾插入
                if(cur.next == null){
                    child.next = cur.next;
                    sign.prev = cur;
                    cur.next = sign;
                }else{
                    //非结尾插入
                    child.next = cur.next;
                    sign.prev = cur;
                    cur.next.prev = child;
                    cur.next = sign;
                }
                cur.child = null;
            }
            cur = cur.next;
        }
        return head;
    }
}
