package dkc_0305;

import java.util.HashMap;
import java.util.Map;

/*
 	给定两个字符串 s 和 t，判断它们是否是同构的。如果 s 中的字符可以被替换得到 t ，那么这两个字符串是同构的。
所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。两个字符不能映射到同一个字符上，但字符可以映射自己本身。

	示例 1:
		输入: s = "egg", t = "add"
		输出: true
	示例 2:
		输入: s = "foo", t = "bar"
		输出: false
	示例 3:
		输入: s = "paper", t = "title"
		输出: true
		
	
 */
public class IsIsomorphic {
	
	public static void main(String[] args) {
		System.out.println(isIsomorphic("", ""));
	}
	public static boolean isIsomorphic(String s,String t) {
		//如果长度不相等直接返回false
		if(s.length() != s.length()) return false;
		//定义StringBuilder对象sb_s 和 sb_t
		StringBuilder sb_s = new StringBuilder();
		StringBuilder sb_t = new StringBuilder();
		//定义两个标记,从1开始，最大可以加到26，因为只有26个字符
		int count_s = 1;
		int count_t = 1;
		//先对两个sb对象添加1，因为首字符不用做比较，它是同构的
		sb_s.append(1);
		sb_t.append(1);
		//从下标1开始遍历遍历
		for(int i = 1;i<s.length();i++) {
			//判断当前字符在前面字符串中的字符是否有相等的，相等返回前面相同字符的下标，不包含返回-1
			int flag_s = isContainsCharacter(s.substring(0, i), s.charAt(i));
			int flag_t = isContainsCharacter(t.substring(0, i), t.charAt(i));
			//有相同字符，那么sb对象就添加之前相同字符下标在sb对象中对应的字符 （这块有点绕口）
			if(flag_s != -1) {
				sb_s.append(sb_s.charAt(flag_s));
			}else {
				//没有相同字符，对标记先加1在加入sb对象中
				sb_s.append(++count_s);
			}
			//有相同字符，那么sb对象就添加之前相同字符下标在sb对象中对应的字符 （这块有点绕口）
			if(flag_t != -1) {
				sb_t.append(sb_t.charAt(flag_t));
			}else {
				//没有相同字符，对标记先加1在加入sb对象中
				sb_t.append(++count_t);
			}
		}
		//比较两个sb对象是否相同，相同返回true，否则返回false
		return sb_s.toString().equals(sb_t.toString());
	}
	//用于比较字符串是否包含字符，包含返回下标，不包含返回-1
	public static int isContainsCharacter(String s,char c) {
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i) == c)
				return i;
		}
		return -1;
	}
}
