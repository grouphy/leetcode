package dkc_0228;

/*
  	给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。如果不存在最后一个单词，请返回 0 。

	说明：一个单词是指由字母组成，但不包含任何空格的字符串。

	示例:
		输入: "Hello World"
		输出: 5
 
 */
public class LengthOfLastWord {
	
	public static void main(String[] args) {
		System.out.println(lengthOfLastWord(" a   "));
	}
	/**
	 * 
	 * @param s
	 * @return
	 * 两种方法，第一种：判断全部是否为空格，是空格返回0，否则返回最后一个单词长度
	 * 第二种其实和第一种类似，首先利用trim()方法，去掉开头和结尾空格，然后计算去掉空格后字符串
	 * 的长度，如果等于0，返回0，否则返回最后一个单词的长度
	 */
	public static int lengthOfLastWord(String s) {
		/*for(int i = 0;i<s.length();i++) {
			if(s.charAt(i) != ' ') {
				String[] str = s.split(" ");
				return str[str.length - 1].length();
			}
		}
		return 0;*/
		
		if(s.trim().length() == 0) return 0;
		String[] str = s.split(" ");
		return str[str.length - 1].length();
	}
}
