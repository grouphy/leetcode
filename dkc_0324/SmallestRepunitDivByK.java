package dkc_0324;

import java.math.BigInteger;
/*
 	输入一个数，如果该数能被所有位都是1的最小放入数除尽，那么输出这个最小数1的长度
 */
public class SmallestRepunitDivByK {
	public static void main(String[] args) {
		long l1 = System.currentTimeMillis();
		for(int i = 1;i<2000;i++) {
			System.out.println("i = "+i+" "+smallestRepunitDivByK(i));
			
		}
		long l2 = System.currentTimeMillis();
		System.out.println("时间为:"+(l2-l1));
		System.out.println("******************");
		long l3 = System.currentTimeMillis();
		for(int i = 1;i<2000;i++) {
			System.out.println("i = "+i+" "+smallestRepunitDivByK1(i));
			
		}
		long l4 = System.currentTimeMillis();
		System.out.println("时间为:"+(l4-l3));
	}
	public static int smallestRepunitDivByK1(int k) {
		int sum = 0;
		for(int i = 1;i<100001;i++) {
			sum = sum * 10 + 1;
			sum %= k;
			if(sum == 0) return i;
		}
		return -1;
	}
	public static int smallestRepunitDivByK(int k) {
		BigInteger bi = new BigInteger("1");
		BigInteger bi1 = new BigInteger("0");
		BigInteger bi2 = new BigInteger(Integer.toString(k));
		BigInteger bi3 = new BigInteger("10");
		if(k%2 == 0||k%5 == 0) return -1;
		if(bi2.equals(bi)) return 1;
		int count = 1;
		while(true) {
			if(bi.mod(bi2).equals(bi1)) {
				return bi.toString().length();
			}
			bi = bi.add(bi3.pow(count++));
			if(bi.toString().length()>100000) return -1;
			//System.out.println(bi);
		}
	}
}
