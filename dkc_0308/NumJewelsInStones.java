package dkc_0308;

import java.util.HashMap;
import java.util.Map;

/*
 	 给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 
 	 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。

	示例 1:
		输入: J = "aA", S = "aAAbbbb"
		输出: 3
	示例 2:
		输入: J = "z", S = "ZZ"
		输出: 0
	注意:
	S 和 J 最多含有50个字母。
	 J 中的字符不重复。
 */
public class NumJewelsInStones {
	
	public static void main(String[] args) {
		System.out.println(numJewelsInStones("aA", "aAAbbb"));
	}
	public static int numJewelsInStones(String str,String s) {
		Map<Character,Integer> mp = new HashMap<Character,Integer>();
		for(int i = 0;i<s.length();i++) {
			int count = 0;
			if(!mp.containsKey(s.charAt(i))) {
				mp.put(s.charAt(i), ++count);
				for(int j = i+1;j<s.length();j++) {
					if(s.charAt(i) == s.charAt(j)) {
						mp.put(s.charAt(j), ++count);
					}
				}
			}
		}
		int sum = 0;
		for(Map.Entry<Character, Integer> e : mp.entrySet()) {
			for(int i = 0;i<str.length();i++) {
				if(str.charAt(i) == e.getKey()) {
					sum += e.getValue();
				}
			}
		}
		return sum;
	}
}
