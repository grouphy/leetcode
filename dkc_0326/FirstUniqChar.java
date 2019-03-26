package dkc_0326;



/*
 	给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
		案例:
		s = "leetcode"
		返回 0.
		s = "loveleetcode",
		返回 2.
	假设我们输入都是小写字母
 */
public class FirstUniqChar {
	public static void main(String[] args) {
		System.out.println(firstUniqChar("aadadaad"));
	}
	public static int firstUniqChar(String s) {
		char[] chars = s.toCharArray();
		int len = chars.length;
		//定义数组长度为26，表示26个字母   0-25  分别表示a-z的位置
		int[] arr = new int[26];
		int count = 1;
		//遍历字符数组，任何一个字母出现一次，都在arr数组对应位置加1
		for(int i = 0;i<len;i++) {
			arr[chars[i] - 'a'] += count;
		}
		for(int i = 0;i<len;i++) {
			if(arr[chars[i] - 'a'] == 1) return i;
		}
		return -1;
	}
}
