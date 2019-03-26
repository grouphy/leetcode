package dkc_0326;
/*
 	给定两个字符串 s 和 t，它们只包含小写字母。
字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
请找出在 t 中被添加的字母。
		示例:
			输入：
			s = "abcd"
			t = "abcde"
			
			输出：
			e

 */
public class FindTheDifference {
	public static char findTheDifference(String s,String t) {
		//定义两个数组分别存储字符串s,t每个字符出现次数
		int[] arr1 = new int[26];
		int[] arr2 = new int[26];
		char[] chars1 = s.toCharArray();
		int len1 = chars1.length;
		char[] chars2 = t.toCharArray();
		int len2 = chars2.length;
		//将字符串s的每一字符出现次数添加到对应字符位置中，没出现一次进行加1操作
		for(int i = 0;i<len1;i++) {
			arr1[chars1[i] - 'a'] += 1;
		}
		for(int i = 0;i<len2;i++) {
			arr2[chars2[i] - 'a'] += 1;
		}
		//遍历数组，找出arr1和arr2中值不相等的，就是要找的对应字符位置，将其转换输出
		for(int i = 0;i<26;i++) {
			if(arr1[i]!=arr2[i]) {
				return (char) (i+97);
			}
		}
		return '0';
	}
}
