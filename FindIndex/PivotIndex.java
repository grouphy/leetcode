package FindIndex;

import java.util.ArrayList;
import java.util.List;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-12
 * Time:21:14
 */
public class PivotIndex {
    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{-1,-1,-1,-1,-1,0}));
    }
    public static int pivotIndex(int[] arr) {
        int len = arr.length;
        System.out.println(len);
        int t = len/2;
        System.out.println(t);
        List<Integer> list = new ArrayList<Integer>();
        while(t>=0&&t<len){
            int sum1 = 0;
            int sum2 = 0;
            for(int i = 0;i<t;i++){
                sum1 += arr[i];
            }
            for(int i = t+1;i<len;i++){
                sum2 += arr[i];
            }
            sum1 = Math.abs(sum1);
            sum2 = Math.abs(sum2);
            if(list.contains(sum1)) return -1;
            list.add(sum1);
            if(sum1>sum2){
                t--;
            }else if(sum1<sum2){
                t++;
            }else{
                return t;
            }
        }
        return -1;
    }
}
