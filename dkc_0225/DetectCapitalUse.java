package dkc_0225;

/*	给定一个单词，你需要判断单词的大写使用是否正确。
	
	我们定义，在以下情况时，单词的大写用法是正确的：
	
	全部字母都是大写，比如"USA"。
	单词中所有字母都不是大写，比如"leetcode"。
	如果单词不只含有一个字母，只有首字母大写， 比如 "Google"。
	否则，我们定义这个单词没有正确使用大写字母。
	
	示例 1:
	
	输入: "USA"
	输出: True
	示例 2:
	
	输入: "FlaG"
	输出: False
*/
public class DetectCapitalUse {
	
	public static Boolean detectCapitalUse(String str) {
		int count1 = 0;
		int count2 = 0;
		for(int i = 0;i<str.length();i++) {
			if(str.charAt(i)>64&&str.charAt(i)<91) {
				count1++;
			}
			if(str.charAt(i)>96&&str.charAt(i)<123) {
				count2++;
			}
		}
		if((count1 == 1 && str.charAt(0)>64&&str.charAt(0)<91) || count1 == str.length())
			return true;
		if(count2 == str.length())
			return true;
		return false;
	}
}
