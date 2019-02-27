package dkc_0227;
/*
  	给定一个字符串和一个整数 k，你需要对从字符串开头算起的每 2k 个字符的前k个字符进行反转。
  	如果剩余少于 k 个字符，则将剩余的所有全部反转。如果有小于 2k 但大于或等于 k 个字符，
  	则反转前 k 个字符，并将剩余的字符保持原样。

	示例:
	输入: s = "abcdefg", k = 2
	输出: "bacdfeg"
 
 */
public class ReverseStr {
	
	
	public static void main(String[] args) {
		System.out.println(reverseStr("abcdefg",3));
	}
	
	public static String reverseStr(String s, int k) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<s.length();i += 2*k) {
			if(i + 2*k < s.length()) { 
				sb.append(reserve(s.substring(i, i+k)));
				sb.append(s.substring(i+k,i+2*k));
			}else if(i+k<s.length()) {
				sb.append(reserve(s.substring(i, i+k)));
				sb.append(s.substring(i+k,s.length()));
			}else {
				sb.append(reserve(s.substring(i,s.length())));
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
