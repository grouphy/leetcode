package dkc_0304;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		String[] s = {"cool","lock","cook"};
		System.out.println(commonChars(s).toString());
	}
	public static List<String> commonChars(String[] s){
		List<String> list = new ArrayList<String>();
		Map<Character,Integer> mp = new HashMap<Character,Integer>();
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<s.length;i++) {
			sb.append(s[i]);
		}
		//cool","lock","cook
		for(int i = 0;i<sb.length();i++) {
			if(!mp.containsKey(sb.charAt(i))) {
				int count = 0;
				mp.put(sb.charAt(i),++count);
				for(int j = i+1;j<sb.length();j++) {
					if(sb.charAt(j) == sb.charAt(i)) {
						mp.put(sb.charAt(j), ++count);
					}
				}
			}
		}
		for(Map.Entry<Character, Integer> e : mp.entrySet()) {
			if(e.getValue()/3 > 0)
				list.add(e.getKey().toString());
			if(e.getKey() == 'c')
				System.out.println(e.getValue());
		}
		return list;
	}
}
