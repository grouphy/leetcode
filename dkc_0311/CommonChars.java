package dkc_0311;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 	给定仅有小写字母组成的字符串数组 A，返回列表中的每个字符串中都显示的全部字符（包括重复字符）组成的列表。
 	例如，如果一个字符在每个字符串中出现 3 次，但不是 4 次，则需要在最终答案中包含该字符 3 次。
你可以按任意顺序返回答案。
	示例 1：
		输入：["bella","label","roller"]
		输出：["e","l","l"]
	示例 2：
		输入：["cool","lock","cook"]
		输出：["c","o"]
 */
public class CommonChars {
	public static void main(String[] args) {
		String[] s = {"cool","looock","cook"};
		System.out.println(commonChars(s).toString());
	}
	
	 public static List<String> commonChars(String[] s) {
		 //定义并初始化两个数组arr和array
		 int[] arr = new int[26];
		 int[] array = new int[26];
		 for(int i = 0;i<26;i++) {
			 arr[i] = 100;
			 array[i] = 0;
		 }
		 for(String str : s) {
			 //初始化array
			 for(int i = 0;i<26;i++) {
				 array[i] = 0;
			 }
			 //统计每个字符出现的次数
			 for(int i = 0;i<str.length();i++) {
				 ++array[str.charAt(i) - 'a'];
			 }
			 //统计每个字符在当前字符串之前所有字符串出现的次数，以出现最少次数为标准赋值
			 for(int i = 0;i<26;i++) {
				 arr[i] = Math.min(arr[i], array[i]);
			 }
		 }
		 List<String> list = new ArrayList<String>();
		 //遍历arr
		 for(int i = 0;i<26;i++) {
			 //j<arr[i]  判断每个字符出现个数，然后进行添加
			 for(int j = 0;j<arr[i];j++) {
				 String ch = "";
				 ch+=(char)('a'+i);
				 list.add(ch);
			 }
		 }
		 return list;
	 }

}