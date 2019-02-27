package dkc_0227;
/*
	 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
	
	示例 1:
	
	输入: "Let's take LeetCode contest"
	输出: "s'teL ekat edoCteeL tsetnoc" 
	注意：在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
 */
public class ReverseWords {
	
	public static void main(String[] args) {
		System.out.println(reverseWords("Let's take LeetCode contest"));
	}
	
	public static String reverseWords(String s) {
        String[] str = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<str.length;i++) {
        	if(i<str.length - 1) {
        		sb.append(reserve(str[i])+" ");
        	}
        	else {
        		sb.append(reserve(str[i]));
        	}
        }
        return new String(sb);
    }
	
	public static String reserve(String str) {
		char[] chars = str.toCharArray();
		int start = 0;
		int end = chars.length - 1;
		while(start<end) {
			char tmp = chars[start];
			chars[start] = chars[end];
			chars[end] = tmp;
			start++;
			end--;
		}
		return new String(chars);
	}
}
