package dkc_0228;

/*
 	给定两个二进制字符串，返回他们的和（用二进制表示）,输入为非空字符串且只包含数字 1 和 0。
	示例 1:
		输入: a = "11", b = "1"
		输出: "100"
	示例 2:
		输入: a = "1010", b = "1011"
		输出: "10101"
 */
public class AddBinary {
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		System.out.println(addBinary("100","110010"));
	}
	
	public static String addBinary(String s1,String s2) {
		StringBuilder sb = new StringBuilder();
		//表示进位
		int c = 0; 
		int s1_index= s1.length() - 1;
		int s2_index = s2.length() - 1;
		while(s1_index>=0 && s2_index>=0) {
			int count = s1.charAt(s1_index) + s2.charAt(s2_index) - 2*'0' + c;
			if(count>1) {
				c = 1;
				sb.append("0");
			}else {
				c = 0;
				sb.append(new StringBuilder(count));
			}
			s1_index--;
			s2_index--;
		}
		while(s1_index>=0) {
			int count = s1.charAt(s1_index) - '0' + c;
			if(count>1) {
				c = 1;
				sb.append("0");
			}else {
				c = 0;
				sb.append(new StringBuilder(count));
			}
			s1_index--;
		}
		while(s2_index>=0) {
			int count = s1.charAt(s2_index) - '0' + c;
			if(count>1) {
				c = 1;
				sb.append("0");
			}else {
				c = 0;
				sb.append(new StringBuilder(count));
			}
			s2_index--;
		}
		if(c == 1) sb.append("1");
		return reserve(new String(sb));
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
