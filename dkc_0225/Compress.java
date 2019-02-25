package dkc_0225;

import java.util.HashMap;
import java.util.Map;

/*
	给定一组字符，使用原地算法将其压缩。
	
	压缩后的长度必须始终小于或等于原数组长度。
	
	数组的每个元素应该是长度为1 的字符（不是 int 整数类型）。
	
	在完成原地修改输入数组后，返回数组的新长度。
	
	示例 1：
	
	输入：
	["a","a","b","b","c","c","c"]
	输出：
	返回6，输入数组的前6个字符应该是：["a","2","b","2","c","3"]
	说明：
	"aa"被"a2"替代。"bb"被"b2"替代。"ccc"被"c3"替代。
	
	示例 2：
	输入：
	["a"]
	输出：
	返回1，输入数组的前1个字符应该是：["a"]
	说明：
	没有任何字符串被替代。
	
	示例 3：
	输入：
	["a","b","b","b","b","b","b","b","b","b","b","b","b"]
	输出：
	返回4，输入数组的前4个字符应该是：["a","b","1","2"]。
	说明：
	由于字符"a"不重复，所以不会被压缩。"bbbbbbbbbbbb"被“b12”替代。
	注意每个数字在数组中都有它自己的位置。
	
	注意：
	所有字符都有一个ASCII值在[35, 126]区间内。
	1 <= len(chars) <= 1000。
*/
public class Compress {
	
	public static void main(String[] args) {
		
		char[] chars1 = {'h','m','f','d','o','z','t','f','f','y'};
		char[] chars = {'a','a','b','b','c','c','c'};
		String str = "abbbbbbbbbbbb";
		int t = compress(str);
		System.out.println(t);
	}
	
	public static int compress(String str) {
		char[] chars = str.toCharArray();
		//统计不重复的
		int len1 = 0;
		//统计重复的
		int len2 = 0;
		Map<Character,Integer> mp = new HashMap<Character,Integer>();
		for(int i = 0;i<chars.length;i++) {
//			'h','m','f','d','o','z','t','f','f','y'
			int count = 1;
			if(!mp.containsKey(chars[i])) {
				mp.put(chars[i], count);
				for(int j = i+1;j<chars.length;j++) {
					if(mp.containsKey(chars[j])) {
						mp.put(chars[j], ++count);
					}
				}
			}
		}
		for(Map.Entry<Character,Integer> e:mp.entrySet()) {
			if(e.getValue() == 1)
				len1++;
			if(e.getValue() > 1) {
				String str1 = "" + e.getValue();
				len2 += 1 + str1.length();
			}	
		}
		return len1+len2;
    }
}
