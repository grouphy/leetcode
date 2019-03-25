package dkc_0325;
/*
 	对于一个 正整数，如果它和除了它自身以外的所有正因子之和相等，我们称它为“完美数”。
给定一个 正整数 n， 如果他是完美数，返回 True，否则返回 False
	示例：
		输入: 28
		输出: True
		解释: 28 = 1 + 2 + 4 + 7 + 14
 */
public class CheckPerfectNumber {
	public static void main(String[] args) {
		System.out.println(checkPerfectNumber(1000000000));
		System.out.println(print(28,0));
	}
	//暴力法，不建议
	public static boolean checkPerfectNumber(int n) {
		int ret = 0;
		for(int i = 1;i<=n/2;i++) 
			if(n%i == 0)
				ret += i;
		return ret == n;
	}
	
	public static int print(int n,int ret) {
		for(int i = n/2;i>0;i--) {
			if(n/i == 0) {
				return ret+print(i, ret);
			}
		}
		return 0;
	}
}
