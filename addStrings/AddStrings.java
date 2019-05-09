package addStrings;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。
 * User:Mr.Du
 * Date:2019-05-10
 * Time:0:06
 */
public class AddStrings {
    public static void main(String[] args) {
        System.out.println(addStrings("6","501"));
    }
    public static String addStrings(String s1, String s2) {
        if(s1.equals("0")||s2.equals("0")){
            return s1.equals("0")?s2:s1;
        }
        StringBuffer sb = new StringBuffer();
        int i = s2.length()-1;
        int j = s1.length()-1;
        int c = 0;
        int res = 0;
        if(s1.length()>=s2.length()){
            while(i>=0){
                res = s1.charAt(j)+s2.charAt(i)+c - 2 * '0';
                System.out.println("res = "+res);
                if(res>9){
                    res = res%10;
                    c = 1;
                }else{
                    c = 0;
                }
                sb.append(res);
                i--;
                j--;
            }
            while(j>=0){
                res = s1.charAt(j)+c - '0';
                if(res>9){
                    res = res%10;
                    c = 1;
                }else{
                    c = 0;
                }
                sb.append(res);
                j--;
            }
        }else{
            while(j>=0){
                res = s1.charAt(j)+s2.charAt(i)+c - 2*'0';
                if(res>9){
                    res = res%10;
                    c = 1;
                }else{
                    c = 0;
                }
                sb.append(res);
                i--;
                j--;
            }
            while(i>=0){
                res = s2.charAt(i)+c-'0';
                if(res>9){
                    res = res%10;
                    c = 1;
                }else{
                    c = 0;
                }
                sb.append(res);
                i--;
            }
        }
        if(c>0){
            sb.append(c);
        }
        return sb.reverse().toString();
    }
}
