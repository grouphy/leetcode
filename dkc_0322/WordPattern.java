package dkc_0322;

import java.util.HashMap;
import java.util.Map;
/*
 	给定一种 pattern(模式) 和一个字符串 str ，判断 str 是否遵循相同的模式。
这里的遵循指完全匹配，例如， pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应模式。

	示例1:
		输入: pattern = "abba", str = "dog cat cat dog"
		输出: true
	示例 2:
		输入:pattern = "abba", str = "dog cat cat fish"
		输出: false
 */
public class WordPattern {
	public static boolean wordPattern(String pattern,String str) {
		 Map<Character,String> map1=new HashMap<Character,String>();
	        char[] pat=pattern.toCharArray();
	        String[] s=str.split(" ");
	        if(pat.length!=s.length)
	            return false;
	        for(int i=0;i<s.length;i++){
	            if(map1.containsKey(new Character(pat[i]))){
	                if(!map1.get(new Character(pat[i])).equals(s[i]))
	                    return false;
	            }else if(map1.containsValue(s[i])){
	                return false;
	            }
	            map1.put(new Character(pat[i]),s[i]);

	        }
	        return true;
	}
}
