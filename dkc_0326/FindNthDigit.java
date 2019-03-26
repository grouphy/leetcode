package dkc_0326;
/*
 	在无限的整数序列 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...中找到第 n 个数字。
	注意:
	n 是正数且在32为整形范围内 ( n < 231)。
	
	示例 1:
		输入:
		3
		输出:
		3
	示例 2:
		输入:
		11
		输出:
		0
		说明:
		第11个数字在序列 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... 里是0，它是10的一部分。
 */
public class FindNthDigit {
	public static void main(String[] args) {
		System.out.println(findNthDigit(100000000));
	}
	public static int findNthDigit(int n) {
		StringBuilder sb = new StringBuilder();
		for(int i = 1;sb.length()<n+1;i++) {
			sb.append(i);
		}
		char c = sb.charAt(n-1);
		return Integer.parseInt(String.valueOf(c));
	}
}
