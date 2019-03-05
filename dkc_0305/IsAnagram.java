package dkc_0305;

import java.util.ArrayList;
import java.util.List;
/*
 	给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。

	示例 1:
		输入: s = "anagram", t = "nagaram"
		输出: true
	示例 2:
		输入: s = "rat", t = "car"
		输出: false
	说明:
	你可以假设字符串只包含小写字母。
 */
public class IsAnagram {
	public static void main(String[] args) {
		System.out.println(isAnagram("",""));
	}
	public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        if(s.length() == 0) return true;
        if(s.length() == 1) return s.equals(t);
        System.out.println(reverse(t));
        String str = s + reverse(t);
        int before = s.length() - 1;
        int after = s.length();
        int dif_t = 0;
        int dif_s = 0;
        int count = 0;
        while(before>=0 && after < str.length()) {
        	if(str.charAt(before) == str.charAt(after)) {
        		before--;
        		after++;
        	}else {
	        	count++;
	        	if(count == 1) {
	        		dif_t = after;
	        		after++;
	        	}
	        	if(count == 2) {
	        		dif_s = before;
	        		before--;
	        	}
	        	if(count>2) {
	        		return false;
	        	}
        	}
        }
        if(str.charAt(dif_t) == str.charAt(dif_s)) 
        	return true;
        return false;
    }
	
	public static String reverse(String s) {
		char[] chars = s.toCharArray();
		int start = 0;
		int end = s.length() - 1;
		while(start < end) {
			char tmp = chars[start];
			chars[start++] = chars[end];
			chars[end--] = tmp;
		}
		return new String(chars);
	}
}
