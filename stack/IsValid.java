package stack;

import java.util.Stack;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-14
 * Time:21:35
 */

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * 示例 1:
 *
 * 输入: "()"
 * 输出: true
 */
public class IsValid {
    public static void main(String[] args) {
        System.out.println(isValid("({})"));
    }
    public static boolean isValid(String str){
        char[] chars = str.toCharArray();
        int len = chars.length;

        if(len == 0) return true;
        Stack<Character> s = new Stack<Character>();
        //() []    { { {} } }
        for(char c:chars){
            if(s.empty()){
                s.push(c);
            }else if(match(s.peek(),c)){
                s.pop();
            }else{
                s.push(c);
            }
        }
        if(s.empty()) return true;
        return false;
    }

    public static boolean match(char c1,char c2){
        if(c1 == '(' && c2 == ')' || c1 =='['&& c2 == ']'
                || c1 == '{' && c2 == '}')
            return true;
        return false;
    }
}
