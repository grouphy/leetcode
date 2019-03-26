package dkc_0326;
/*
 	给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，判断第一个字符串ransom能不能由第二个字符串magazines里面的字符构成。
 	如果可以构成，返回 true ；否则返回 false。
(题目说明：为了不暴露赎金信字迹，要从杂志上搜索各个需要的字母，组成单词来表达意思。)

		canConstruct("a", "b") -> false
		canConstruct("aa", "ab") -> false
		canConstruct("aa", "aab") -> true
 */
public class CanConstruct {
	public static void main(String[] args) {
		
		System.out.println(canConstruct("aad", "aab"));
	}
	public static boolean canConstruct(String str,String s) {
		char[] chars = s.toCharArray();
		int j = 0;
		for(int i = 0;i<str.length();i++) {
			for(j = 0;j<chars.length;j++) {
				if(str.charAt(i)==chars[j]) {
					
					chars[j] = '1';
					break;
				}
			}
			if(j == chars.length)
				return false;
		}
		return true;
	}
}
