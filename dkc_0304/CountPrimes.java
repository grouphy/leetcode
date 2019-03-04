package dkc_0304;
/*
 	统计所有小于非负整数 n 的质数的数量。

	示例:
		输入: 10
		输出: 4
	解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 
 */
public class CountPrimes {
	
	public static void main(String[] args) {
		System.out.println(countPrimes(10));
	}
	public static int countPrimes(int n) {
		n = n - 1;
		int count = 0;
		while(n>1) {
			int i = 2;
			int t = (int)Math.sqrt(n);
			while(i <= t) {
				if(n % i == 0) {
					break;
				}
				i++;
			}
			//判断是否是质数，是加1，不是继续判断下一个数
			if(i > t) {
				count++;
			}
			n--;
		}
		return count;
		
	}
}
