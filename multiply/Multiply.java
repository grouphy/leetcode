package multiply;

import java.util.Arrays;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:给定两个以字符串形式表示的非负整数 num1 和 num2，返回 num1 和 num2 的乘积，
 * 它们的乘积也表示为字符串形式。
 * 示例 1:
 * 输入: num1 = "2", num2 = "3"
 * 输出: "6"
 * 示例 2:
 *
 * 输入: num1 = "123", num2 = "456"
 * 输出: "56088"
 * 说明：
 *
 * num1 和 num2 的长度小于110。
 * num1 和 num2 只包含数字 0-9。
 * num1 和 num2 均不以零开头，除非是数字 0 本身。
 * 不能使用任何标准库的大数类型（比如 BigInteger）或直接将输入转换为整数来处理。
 * User:Mr.Du
 * Date:2019-05-09
 * Time:17:24
 */
public class Multiply {

    public static void main(String[] args) {
        System.out.println("999*99 = "+multiply("999","99"));
    }

    public static String multiply(String s1, String s2) {
        //如果有一个为0，直接返回0
        if(s1 == "0"||s2 == "0") return s1;
        //定义数组，用来存储最后的结果
        int[] arr = new int[s1.length()+s2.length()];
        int index = 0;
        //用于表示两数相乘的进位
        int c = 0;
        //用于表示两数相加的进位
        int d = 0;
        //判断s1和s2的长度,将长度长的字符串作为第一个乘数，则外层循环就是长度短的字符串
        if(s1.length()>=s2.length()){
            for(int i = s2.length()-1;i>=0;i--){
                for(int j=s1.length()-1;j>=0;j--) {
                    //计算两数相乘
                    int res = (s2.charAt(i) - '0') * (s1.charAt(j) - '0') + c;
                    //如果相乘数+进位c大于9，则c = res / 10，否则等于0
                    if (res > 9) {
                        c = res / 10;
                    } else {
                        c = 0;
                    }
                    //此时数组arr的index位置的值加上res取模后的数和进位d
                    arr[index] += res % 10 + d;
                    //如果index位置值大于9，先让d = 当前index位置的值除以10，然后对该值取模重新赋给index位置，否则d = 0；
                    if (arr[index] > 9) {
                        d = arr[index]/10;
                        arr[index] = arr[index] % 10;
                    } else {
                        d = 0;
                    }
                    //index自增
                    index++;
                }
                //内层循环进行完毕，arr[index-1]在相加时可能存在进位，那么index位置上的值可表示为两进位之和
                int tmp = c + d;
                //如果此时tmp>0,index位置的值为tmp%10，index+1位置的值为1，否则，index位置的值为tmp
                if(tmp>9){
                    arr[index] = tmp%10;
                    arr[index+1] = 1;
                }else{
                    arr[index] = tmp;
                }
                //下次进入循环的index应该从index - (s1.length() - 1)位置开始
                //假设我们出入s1 = "1234"和s2 = "456",我们第一次进入内层循环时，index从0开始，第二次进入内层循环时
                //，index从1开始，第三次进入循环时，index从2开始，我们就会发现规律index从第二次开始的都是从下标
                // index - s1.length() + 1开始的
                index -= (s1.length() - 1);
                //退出内层循环将两个进位都置为0
                c=0;
                d = 0;
            }
        }else{
            for(int i = s1.length()-1;i>=0;i--){
                for(int j=s2.length()-1;j>=0;j--){
                    int res = (s1.charAt(i) - '0') * (s2.charAt(j) - '0') + c;
                    if (res > 9) {
                        c = res / 10;
                    } else {
                        c = 0;
                    }
                    arr[index] += res % 10 + d;
                    if (arr[index] > 9) {
                        arr[index] = arr[index] % 10;
                        d = 1;
                    } else {
                        d = 0;
                    }
                    index++;
                }
                int tmp = c + d;
                if(tmp>9){
                    arr[index] = tmp%10;
                    arr[index+1] = 1;
                }else{
                    arr[index] = tmp;
                }
                index -= (s2.length() - 1);
                c=0;
                d = 0;
            }
        }
        //将数组内容放入到append中
        StringBuffer sb = new StringBuffer();
        for(int i = arr.length-1;i>=0;i--){
            if(arr[i]==0&&i==arr.length-1){
                continue;
            }else{
                sb.append(arr[i]);
            }
        }
        //返回字符串
        return sb.toString();
    }
}
