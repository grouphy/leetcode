package dkc_0302;
/*
 	给定一个整数 n，返回 n! 结果尾数中零的数量。

	示例 1:
	
	输入: 3
	输出: 0
	解释: 3! = 6, 尾数中没有零。
	示例 2:
	
	输入: 5
	输出: 1
	解释: 5! = 120, 尾数中有 1 个零.
 */
public class TrailingZeroes {
	
	public static void main(String[] args) {
		System.out.println(trailingZeroes(5));
	}
	
	public static int trailingZeroes(int n) {
		return n<5?0:n/5+trailingZeroes(n/5);
	}
}
