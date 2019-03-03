package dkc_0303;
/*
 	统计一个数的二进制中有多少个1
 	
 	直接用位运算
 */
public class HammingWeight {
	
	public static void main(String[] args) {
		System.out.println(hammingWeight(-3));
	}
	
	public static int hammingWeight(int n) {
		int count = 0;
		for(int i = 0;i<32;i++) {
			if((n&(1<<i)) != 0) count++;
		}
		return count;
	}
}
