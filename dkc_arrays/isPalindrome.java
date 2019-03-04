package cn.dkc_arrays;

import java.util.Scanner;

//给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
/*说明：本题中，我们将空字符串定义为有效的回文串。

示例 1:

输入: "A man, a plan, a canal: Panama"
输出: true*/
public class isPalindrome {
	public boolean ispalindrome(String s) {
		//统计符合要求的字符数
		int count = 0;
		//转小写
		String str = s.toLowerCase();
		//拆分成字符数组
		char[] buff1 = str.toCharArray();
		//就算新数组长度
		for(int i = 0;i<buff1.length;i++) {
			if((96<buff1[i]&&buff1[i]<123)||('0'<=buff1[i]&&buff1[i]<='9')) {
				count++;
			}
		}
		char[] buff2 = new char[count];
		int j = 0;
		//将符合要求的字符赋给buff2数组
		for(int i = 0;i<buff1.length;i++) {
			if((96<buff1[i]&&buff1[i]<123)||('0'<=buff1[i]&&buff1[i]<='9')) {
				buff2[j] = buff1[i];
				j++;
			}
		}
		for(char i:buff2)
			System.out.print(i+" ");
		//判断是否是回文
		int start = 0;
		int end = buff2.length - 1;
		while(start<=end) {
			if(buff2[start] == buff2[end]) {
				start++;
				end--;
			}
			else
				break;
		}
		if(start<end)
			return false;
		else
			return true;
	}
	
	public static void main(String[] args) {
		System.out.println("请输入字符串");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		//new isPalindrome().ispalindrome(str);
		boolean b = new isPalindrome().ispalindrome(str);
		System.out.println(b);
	}
}
