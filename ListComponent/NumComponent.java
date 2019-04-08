package ListComponent;

import java.util.ArrayList;
import java.util.List;

public class NumComponent {
    public int numComponents(ListNode head, int[] arr) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i:arr){
            list.add(i);
        }
        ListNode cur = head;
        int count = 0;
        while(cur!=null){
            ListNode sign = cur;
            while(sign!=null){
                if(list.contains(sign.val)){
                    sign = sign.next;
                }else{
                    break;
                }
            }
            if(sign!=cur){
                count++;
                cur = sign;
            }else{
                cur = cur.next;
            }

        }
        return count;
    }
}
